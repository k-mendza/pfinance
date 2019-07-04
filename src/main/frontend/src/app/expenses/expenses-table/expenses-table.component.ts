import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatSort, MatTable } from '@angular/material';
import { ExpensesTableDataSource } from './expenses-table-datasource';
import {ExpenseService} from "../expense.service";
import {Expense} from "../expense.model";

@Component({
  selector: 'app-expenses-table',
  templateUrl: './expenses-table.component.html',
  styleUrls: ['./expenses-table.component.css']
})
export class ExpensesTableComponent implements AfterViewInit, OnInit {
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: false}) sort: MatSort;
  @ViewChild(MatTable, {static: false}) table: MatTable<Expense>;
  dataSource: ExpensesTableDataSource;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = [
    'id', 'appUserLogin', 'payeeName',
    'paySourceName', 'title', 'description',
    'amount','currencyId','paymentDate',
    'creationDate','categoryName','subcategoryName'];

  constructor(private expService: ExpenseService){

  }

  ngOnInit() {
    this.dataSource = new ExpensesTableDataSource(this.expService);
    this.dataSource.loadData();
  }

  ngAfterViewInit() {
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    this.table.dataSource = this.dataSource;
  }
}
