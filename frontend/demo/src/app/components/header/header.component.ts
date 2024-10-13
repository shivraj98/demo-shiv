import { Component } from '@angular/core';
import { ViewbookComponent } from '../../pages/viewbook/viewbook.component';
import { Route, Router, RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [ViewbookComponent,RouterLink,RouterOutlet],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {


  constructor(private router:Router){}

  getBook(){
    this.router.navigate(["/view"]);
  }

}
