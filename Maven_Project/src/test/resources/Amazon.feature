
@Amazon_Test
Feature: Amazon - User Address

  #Background:
   #Given Open browser and application
  
  @Add_Address
  Scenario Outline: Validate Add Address 
    Given login into application using <username>,<password> 
    Given navigate to your account page
    When clicks on your addresses to navigate your adress page
    When clicks on add adress
    When fill all mandatory fields and clicks on add adress button
    Then validate the adress on your address page
   Examples: 
    |username|password|
    |karim27 |pass123	|	   
    
   
  @Edit_Address  
  Scenario Outline: Validate Edit Address 
    Given login into application using <username>,<password>
    Given navigate to your account page
    When clicks on your addresses to navigate your adress page
    When clicks on edit button for existing adress
    When update address and clicks on update address button
    Then validate the adress on your address page
 Examples: 
    |username|password|
    |karim27 |pass123	|	   
  
    
  @Delete_Address  
  Scenario Outline: Validate Delete Address 
    Given login into application <username>,<password>
    Given navigate to your account page
    When clicks on your addresses to navigate your adress page
    When clicks on remove button for existing adress
    When clicks on yes button in confirmation pop-up window
    Then validate the adress on your address page
  Examples: 
    |username|password|
    |karim27 |pass123	|	   
   

  

