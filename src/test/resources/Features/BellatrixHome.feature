Feature: Bellatrix

Scenario: Bellatrix Test
	Given Search result for Falcon Item
	When All results must contain Falcon word in the product title

Scenario: Proton Product display
	Given Search result for proton Item
	When All results must contain proton word in the product title

Scenario: Display by sort by popularity
	Given Search result sort by popularity
	Then Result should be display by poularity
	
Scenario: Display by Low to High Price
	Given Search Result sort by low to high Price
	Then Get all Price of low to high product 