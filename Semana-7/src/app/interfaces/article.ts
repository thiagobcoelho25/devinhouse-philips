export interface Article {
  id: number,
  titulo: string,
  linguagem_skill: string,
  categoria: string,
  descricao: string
  youtube_link: string | null
}

export interface PostArticle {
  titulo: string,
  linguagem_skill: string,
  categoria: string,
  descricao: string
  youtube_link: string | null
}
