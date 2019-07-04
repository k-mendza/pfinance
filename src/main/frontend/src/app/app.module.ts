import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {ExpenseService} from "./expenses/expense.service";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatTableModule} from '@angular/material/table';
import {ExpensesComponent} from "./expenses/expenses.component";
import {HttpClientModule} from "@angular/common/http";
import { ExpensesTableComponent } from './expenses/expenses-table/expenses-table.component';
import { MatPaginatorModule, MatSortModule } from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    ExpensesComponent,
    ExpensesTableComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatTableModule,
    HttpClientModule,
    MatPaginatorModule,
    MatSortModule
  ],
  providers: [ExpenseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
