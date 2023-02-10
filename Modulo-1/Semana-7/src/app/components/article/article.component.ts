import { Component, EventEmitter, Input, Output } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { Article } from 'src/app/interfaces/article';



@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent {

  @Input("article-input")
  artigo: Article = { categoria: "categoria", descricao: "descricao", id: 1, linguagem_skill: "linguagem_skill", titulo: "titulo", youtube_link: "youtube_link" }

  @Output("delecao-article-output")
  newItemEvent = new EventEmitter<number>();


  display: any = {
    'display': 'none'
  }

  constructor(public sanitizer: DomSanitizer) {

  }

  deleteArticle() {
    this.newItemEvent.emit(this.artigo.id)
  }

  changeDisplayYoutube() {
    console.log(this.display)
    this.display['display'] = this.display['display'] === 'none' ? 'block' : 'none'
  }

  // https://www.youtube-nocookie.com/embed/i8eBBG46H8A
  sanitizerVideoUrl() {
    // Appending an ID to a YouTube URL is safe.
    // Always make sure to construct SafeValue objects as
    // close as possible to the input data so
    // that it's easier to check if the value is safe.
    const link = this.artigo?.youtube_link || "https://www.youtube.com/"
    const safe_link = this.sanitizer.bypassSecurityTrustResourceUrl(link)

    return safe_link
  }

}
