import {Injectable} from "@angular/core";
import {Expense} from "./expense.model";

@Injectable()
export class ExpenseService {
  private expenses: Expense[] = [
    new Expense(
      1,
      'myLogin@com.com',
      'Payee',
      'CreditCard',
      'Title',
      'desc',
      19.99,
      'PLN',
      '2019-06-30',
      '2019-06-30',
      'category',
      'subcategory'
    )
  ];

  getExpenses() {
    return this.expenses.slice();
  }
}
