import {Injectable} from "@angular/core";
import {Expense} from "./expense.model";
import {HttpClient} from "@angular/common/http";

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

  constructor(private http: HttpClient){

  }

  getExpenses() {
    return this.http.get('http://localhost:8090/api/expenses/');
  }
}
