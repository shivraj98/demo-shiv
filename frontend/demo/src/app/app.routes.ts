import { Routes } from '@angular/router';
import { ViewbookComponent } from './pages/viewbook/viewbook.component';
import { CreatbookComponent } from './pages/creatbook/creatbook.component';

export const routes: Routes = [
    {path:"view",component:ViewbookComponent},
    {path:"create",component:CreatbookComponent},
];
