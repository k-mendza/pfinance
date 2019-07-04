import {Component, OnDestroy, OnInit} from '@angular/core';
import {ExpenseService} from "./expense.service";
import {Expense} from "./expense.model";
import {Subscription} from "rxjs";


/**
 * @title Basic use of `<table mat-table>`
 */
@Component({
  selector: 'expenses',
  styleUrls: ['expenses.component.css'],
  templateUrl: 'expenses.component.html',
})
export class ExpensesComponent implements OnInit,OnDestroy{
  expenses: Expense[];
  displayedColumns: string[] =
    ['id', 'appUserLogin', 'payeeName', 'paySourceName','title', 'description',
    'amount', 'currencyId', 'paymentDate', 'creationDate',
    'categoryName','subcategoryName'];
  dataSource = this.expenses;
  getExpensesSub: Subscription;

  constructor(private es: ExpenseService){

  }

  ngOnInit(){
    this.getExpensesSub = this.es.getExpenses().subscribe(
      (expenses: Expense[]) => {
        this.expenses = expenses;
      },
      (error) => console.log(error)
    )
  }

  ngOnDestroy(){
    this.getExpensesSub.unsubscribe();
  }
}
