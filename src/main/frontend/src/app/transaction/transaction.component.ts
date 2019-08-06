import { Component, OnInit } from '@angular/core';
import {MatTableDataSource} from "@angular/material";
import {Transaction} from "./transaction.model";

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {
  displayedColumns = [
    'id', 'appUserLogin', 'payeeName',
    'paySourceName', 'title', 'description',
    'amount','currencyId','paymentDate',
    'creationDate','categoryName','subcategoryName'];  dataSource = new MatTableDataSource<Transaction>();
  constructor() { }

  ngOnInit() {
  }

}
