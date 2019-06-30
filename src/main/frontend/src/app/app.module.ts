import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ExpensesComponent } from './expenses/expenses.component';
import { ExpenseListComponent } from './expenses/expense-list/expense-list.component';
import { ExpenseItemComponent } from './expenses/expense-list/expense-item/expense-item.component';
import {ExpenseService} from "./expenses/expense.service";

@NgModule({
  declarations: [
    AppComponent,
    ExpensesComponent,
    ExpenseListComponent,
    ExpenseItemComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [ExpenseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
