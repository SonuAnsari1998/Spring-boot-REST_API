/*10. 📦 Courier Service API

## Scenario

A courier company wants APIs to manage parcel deliveries.

## Requirements

Database Table: `couriers`

Base URL: `/couriers`

### APIs

* `POST /couriers/send`
* `GET /couriers`
* `GET /couriers/{id}`
* `PUT /couriers/update/{id}`
* `PATCH /couriers/status/{id}`
* `DELETE /couriers/delete/{id}`

## Model Fields

* courierId
* senderName
* receiverName
* city
* deliveryStatus

## Sample RequestBody

{
  "courierId": 901,
  "senderName": "Ravi",
  "receiverName": "Mohan",
  "city": "Hyderabad",
  "deliveryStatus": "Shipped"
}

*/
