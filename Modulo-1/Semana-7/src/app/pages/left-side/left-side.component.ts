import { Component, OnDestroy, OnInit } from '@angular/core';

import { Article } from 'src/app/interfaces/article';
import { Card } from 'src/app/interfaces/card';
import { ArticleServiceService } from 'src/app/services/article-service.service';

@Component({
  selector: 'app-left-side',
  templateUrl: './left-side.component.html',
  styleUrls: ['./left-side.component.css']
})
export class LeftSideComponent implements OnInit, OnDestroy {

  // SST - Single Source of Truth
  artigos: Article[] = []

  artigos_filtrados: Article[] = []
  cards: Card = { Total: 0, FrontEnd: 0, BackEnd: 0, FullStack: 0, SoftSkill: 0 }


  constructor(private articleService: ArticleServiceService) { }

  ngOnInit(): void {
    this.getArticles()
  }


  private getArticles(): void {
    this.articleService.getArticles()
      .subscribe(
        data => {
          this.artigos = data;
          this.artigos_filtrados = data;
          this.mountCards(data)
        }
      )
    // this.articleService.getArticles()
    //   .subscribe({
    //     next: data => {
    //       this.artigos = data;
    //       this.artigos_filtrados = data;
    //       this.mountCards(data)
    //     }, error: (error) => {
    //       console.log("error do subscribe: ", error)
    //     }
    //   });
  }

  deleteArticle(id: number) {
    this.articleService.deleteArticle(id).subscribe({
      next: () => {
        const artigo = this.artigos.find(ele => ele.id === id)
        this.artigos = this.artigos.filter(ele => ele.id !== id)
        this.artigos_filtrados = this.artigos_filtrados.filter(ele => ele.id !== id)

        const categoria = artigo?.categoria as keyof Card
        this.cards[categoria] -= 1
        this.cards.Total -= 1
      },
      error: (error) => {
        console.log("error do subscribe de Delete: ", error)
      }
    })
  }

  searchFilter(search_elemet: string) {
    if (search_elemet.trim() !== "") {
      this.artigos_filtrados = this.artigos.filter(artigo => artigo.titulo.toLowerCase().includes(search_elemet))
    }
  }

  clearSearchFilter() {
    this.artigos_filtrados = this.artigos
  }

  private mountCards(data: Article[]) {
    data.forEach(article => {
      const categoria = article.categoria as keyof Card
      this.cards[categoria] += 1
      this.cards.Total += 1
    })
  }

  ngOnDestroy(): void {
    // Não precisa se preocupar com memory leakage do subscribe do httpService
    // https://stackoverflow.com/questions/35042929/is-it-necessary-to-unsubscribe-from-observables-created-by-http-methods
  }

}
