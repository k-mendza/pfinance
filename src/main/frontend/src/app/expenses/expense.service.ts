import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ExpenseService {

  constructor(private http: HttpClient){

  }

  getExpenses() {
    return this.http.get('http://localhost:8090/api/transactions');
  }

  deleteExpense(id: number) {
    return this.http.delete('http://localhost:8090/api/transactions/' + id.toString());
  }
}
