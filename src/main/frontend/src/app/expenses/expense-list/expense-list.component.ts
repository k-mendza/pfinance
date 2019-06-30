import { Component, OnInit } from '@angular/core';
import {Expense} from "../expense.model";
import {ExpenseService} from "../expense.service";

@Component({
  selector: 'app-expense-list',
  templateUrl: './expense-list.component.html',
  styleUrls: ['./expense-list.component.css']
})
export class ExpenseListComponent implements OnInit {
  expenses: Expense[];
  headElements: ['ID', 'appUserLogin', 'payeeName', 'paySourceName', 'title',
                  'description', 'amount', 'currencyId', 'paymentDate', 'creationDate',
                  'categoryName', 'subcategoryName'];

  constructor(private expenseService: ExpenseService) { }

  ngOnInit() {
    this.expenses = this.expenseService.getExpenses();
  }

}
