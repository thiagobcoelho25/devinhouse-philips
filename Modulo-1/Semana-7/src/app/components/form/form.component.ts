import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ArticleServiceService } from 'src/app/services/article-service.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  categorias: string[] = ["FrontEnd", "BackEnd", "FullStack", "SoftSkill"]
  valores_min_max = {
    titulo: [8, 64],
    linguagem_skill: [2, 16],
    descricao: [16, 512]
  }

  constructor(private articleService: ArticleServiceService) { }

  right_side_form = new FormGroup({
    tituloFormControl: new FormControl('', Validators.compose([Validators.required, Validators.minLength(this.valores_min_max.titulo[0]),
    Validators.maxLength(this.valores_min_max.titulo[1])])),
    linguagemSkillFormControl: new FormControl('', Validators.compose([Validators.required, Validators.minLength(this.valores_min_max.linguagem_skill[0]),
    Validators.maxLength(this.valores_min_max.linguagem_skill[1])])),
    categoriaFormControl: new FormControl('', Validators.required),
    descricaoFormControl: new FormControl('', Validators.compose([Validators.required, Validators.minLength(this.valores_min_max.descricao[0]),
    Validators.maxLength(this.valores_min_max.descricao[1])])),
    youtubeLinkFormControl: new FormControl(null, Validators.pattern("https?://.+"))
  })


  onSubmit() {
    if (this.right_side_form.valid) {

      this.articleService.createArticle({
        titulo: this.right_side_form.get('tituloFormControl')?.value || "",
        categoria: this.right_side_form.get('categoriaFormControl')?.value || "",
        descricao: this.right_side_form.get('descricaoFormControl')?.value || "",
        linguagem_skill: this.right_side_form.get('linguagemSkillFormControl')?.value || "",
        youtube_link: this.right_side_form.get('youtubeLinkFormControl')?.value || null,
      }).subscribe({
        next: () => {
          window.alert("Artigo criado Com Sucesso!!");
        },
        error: (error) => {
          console.log("error do subscribe de criação do Artigo: ", error)
        }
      })

    }
    //this.right_side_form.reset()
    //console.log(this.right_side_form.value);
  }

}
