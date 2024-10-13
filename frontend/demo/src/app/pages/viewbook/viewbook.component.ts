import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../../services/bookservice.service';
import { Book } from '../../interface/reponse';
import { HeaderComponent } from '../../components/header/header.component';

@Component({
  selector: 'app-viewbook',
  standalone: true,
  imports: [HeaderComponent],
  templateUrl: './viewbook.component.html',
  styleUrl: './viewbook.component.css'
})
export class ViewbookComponent implements OnInit {


  books:Book[]=[]


  constructor(private bookService:BookserviceService){}

  ngOnInit(): void {
    console.log("hii");
    this.bookService.getBooks().subscribe((response)=>{
      console.log(response);

      console.log("sad"+response.data);
      this.books=response.data;
    })
    console.log(this.books);
  }


  



  
}
