import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ResponseData } from '../interface/reponse';

@Injectable({
  providedIn: 'root'
})
export class BookserviceService {


  bookUrl="/api/books"
  constructor(private httpClient:HttpClient) { }


  getBooks():Observable<ResponseData>{
    return this.httpClient.get<ResponseData>(this.bookUrl);
  }


}
