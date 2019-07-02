import {Component, OnDestroy, OnInit} from '@angular/core';
import {ExpenseService} from "./expense.service";
import {Expense} from "./expense.model";
import {Subscription} from "rxjs";

export interface ExpenseElement {
  id: number;
  appUserLogin: string;
  payeeName: string;
  paySourceName: string;
  title: string;
  description: string;
  amount: number;
  currencyId: string;
  paymentDate: string;
  creationDate: string;
  categoryName: string;
  subcategoryName: string;

}

const EXPENSE_DATA: ExpenseElement[] = [
  {
    id: 1,
    appUserLogin: 'Login',
    payeeName: 'Payee',
    paySourceName: 'PaySourceName',
    title: 'title',
    description: 'desc',
    amount: 99.99,
    currencyId: 'PLN',
    paymentDate: '2019-07-02',
    creationDate: '2019-07-02',
    categoryName: 'Category',
    subcategoryName: 'Subcategory'
  },
];

/**
 * @title Basic use of `<table mat-table>`
 */
@Component({
  selector: 'expenses',
  styleUrls: ['expenses.component.css'],
  templateUrl: 'expenses.component.html',
})
export class ExpensesComponent implements OnInit,OnDestroy{
  displayedColumns: string[] = ['id','title', 'amount', 'currencyId', 'paymentDate','categoryName','subcategoryName'];
  dataSource = EXPENSE_DATA;

  getExpensesSub: Subscription;

  expenses: Expense[];

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
