import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root'
})


export class KataForFunService {
  private apiUrl = 'http://localhost:8080/kata-for-fun';

  constructor(private http: HttpClient) { }


  convertNumber(inputNumber: number): Observable<Result> {
    const url = `${this.apiUrl}/${inputNumber}`;
    return this.http.get<Result>(url, httpOptions);
  }

}
