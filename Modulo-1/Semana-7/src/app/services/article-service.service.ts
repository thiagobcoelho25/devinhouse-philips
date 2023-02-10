import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, of, retry, tap, throwError } from 'rxjs';
import { Article, PostArticle } from '../interfaces/article';

@Injectable({
  // devido ao 'root', esse servico e um singleton
  providedIn: 'root'
})
export class ArticleServiceService {

  URL: string = "http://localhost:3000/resultados";

  constructor(private httpClient: HttpClient) { }

  getArticles(): Observable<Article[]> {
    return this.httpClient.get<Article[]>(this.URL).pipe(retry(1), catchError(this.handleError<Article[]>('getArticles', [])));
  }

  createArticle(artigo: PostArticle) {
    return this.httpClient.post<PostArticle>(this.URL, artigo).pipe(catchError(this.handleErrorAndThrow<Article>('createArticle')));
  }

  deleteArticle(id: number): Observable<Article[]> {
    return this.httpClient.delete<Article[]>(`${this.URL}/${id}`).pipe(catchError(this.handleErrorAndThrow<Article[]>('deleteArticle')));
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error("console.log do servico: ", error); // log to console instead

      // TODO: better job of transforming error for user consumption
      ////this.log(`${operation} failed: ${error.message}`);
      let errorMessage = ""
      if (error.error instanceof ErrorEvent) {
        // Get client-side error
        errorMessage = error.error.message;
      } else {
        // Get server-side error
        errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
      }

      window.alert(errorMessage);

      // Let the app keep running by returning an empty result.
      return of(result as T);

      // caso queira passar o error para o componente
      // documentação ANGULAR para tratamento error do http
      // https://stackoverflow.com/questions/44385777/how-does-http-error-handling-work-with-observables
      // throw error;
    };
  }

  private handleErrorAndThrow<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error("console.log do servico: ", error); // log to console instead

      // TODO: better job of transforming error for user consumption
      ////this.log(`${operation} failed: ${error.message}`);
      let errorMessage = ""
      if (error.error instanceof ErrorEvent) {
        // Get client-side error
        errorMessage = error.error.message;
      } else {
        // Get server-side error
        errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
      }

      window.alert(errorMessage);

      throw error;
    };
  }


}
