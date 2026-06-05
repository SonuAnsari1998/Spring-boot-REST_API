/*9. 🏦 BankingTransaction API

## Scenario

A bank wants APIs to manage customer accounts and transactions.

## Requirements

Database Table: `accounts`

Base URL: `/accounts`

### APIs

* `POST /accounts/create`
* `GET /accounts`
* `GET /accounts/{id}`
* `PUT /accounts/update/{id}`
* `PATCH /accounts/balance/{id}`
* `DELETE /accounts/delete/{id}`

## Model Fields

* accountNumber
* holderName
* accountType
* balance
* branch

## Sample RequestBody

{
  "accountNumber": 801,
  "holderName": "Anjali",
  "accountType": "Savings",
  "balance": 50000,
  "branch": "Hyderabad"
}
*/
