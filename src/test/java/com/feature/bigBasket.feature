Feature: Buy few products

Scenario: Buy products from Bigbasket
Given open Browser and navigate to "https://www.bigbasket.com/"
When Buy Vegitable cat "veg" name "tomato" brand "local" grams "1000gms"  delivery "tomorrow" payment_method "creditcard"
When Buy Vegitable
|cat |Name     |Brand |Grams 	|Delivery |Paymentmethod|
|veg |Tomato   |Local	|1000		|Tomorrow |Creditcard|


@Regression @Smoke
Scenario Outline:
Given open Browser and navigate to "https://www.bigbasket.com/"
When Buy items <Cat> <Name> <Qty> <PaymentMethod>
Examples:
|Cat 			|Name 		|Qty 		|PaymentMethod|
|Other		|Colgate 	|10 		|CC |
|Other 		|Aerial 	|2 			|CC |
|Other 		|Honey 		|1 			|CC |



