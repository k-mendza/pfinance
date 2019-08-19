import {Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator, MatSort, MatTableDataSource} from "@angular/material";
import {Transaction} from "./transaction.model";
import {TransactionService} from "./transaction.service";

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {
  displayedColumns = [
    'id',
    // 'appUserLogin',
    // 'payeeName',
    // 'paySourceName',
    'title',
    'description',
    'amount',
    // 'currencyId',
    'paymentDate',
    'creationDate'];
    // 'categoryName',
    // 'subcategoryName'];
  dataSource = new MatTableDataSource<Transaction>();

  @ViewChild(MatSort, { static: false }) sort: MatSort;
  @ViewChild(MatPaginator, { static: false }) paginator: MatPaginator;

  constructor(private transactionService: TransactionService) { }

  ngOnInit() {
    this.getTransactions();
  }

  getTransactions() {
    this.transactionService.fetchTransactions().subscribe(
      res => {
        this.dataSource.data = res;
      },
      error => {alert('An error has occurred while fetching transactions')}
    );
  }
}
