import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Transaction} from "./transaction.model";

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  constructor(private http: HttpClient) { }

  fetchTransactions() {
    return this.http.get<Transaction[]>("http://localhost:8090/api/v1/transactions/");
  }
}
