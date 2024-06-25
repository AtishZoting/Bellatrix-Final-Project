Feature: Cart Page Step Defination

Scenario: Adding two product in cart and check its values
	Given click on falcon  add cart button
	Then click on falcon view cart
	And go to home tab
	And click on proton rocket add cart button
	And click on proton view cart
	Then get total values of added products


#Scenario:
	#Given Click on cart Menu button
#	Then get msg on Cart

Scenario: Adding Product in cart then proceed all Formalities then get order number
		Given Add in cart Falcon9 in cart
		Then Click on view cart button
		Then verify wheather added product shows in cart and gets product name and its price
	#	Then proceed to check out Menu
		#Then fill all details in check out window
		#Then place order
		#Then verify order number date n order received meassage
