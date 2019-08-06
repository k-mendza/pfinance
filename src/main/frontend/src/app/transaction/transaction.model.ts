export interface Transaction {
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
