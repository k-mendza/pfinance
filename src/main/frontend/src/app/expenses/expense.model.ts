export class Expense {
  public id: number;
  public appUserLogin: string;
  public payeeName: string;
  public paySourceName: string;
  public title: string;
  public description: string;
  public amount: number;
  public currencyId: string;
  public paymentDate: string;
  public creationDate: string;
  public categoryName: string;
  public subcategoryName: string;


  constructor(id: number, appUserLogin: string, payeeName: string, paySourceName: string, title: string, description: string, amount: number, currencyId: string, paymentDate: string, creationDate: string, categoryName: string, subcategoryName: string) {
    this.id = id;
    this.appUserLogin = appUserLogin;
    this.payeeName = payeeName;
    this.paySourceName = paySourceName;
    this.title = title;
    this.description = description;
    this.amount = amount;
    this.currencyId = currencyId;
    this.paymentDate = paymentDate;
    this.creationDate = creationDate;
    this.categoryName = categoryName;
    this.subcategoryName = subcategoryName;
  }
}
