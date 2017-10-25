Feature: User searchs listing in NY


Background: 
     Given User is on the home page
   # And   User logins in using "sking@testmail.com" and "password"
     
@Staytest27
Scenario: Verify search listing
     And   User seraches "New York NY, United States" on the user account page
     Then  User cliks New York listing 
     And   User cliks Rahul Kumars profile
     Then  Message should be "Listings by Rahul Kumar"
     
@4staytest     
Scenario: User should able to update Privacy
     And  User clicks profile picture and goes to privacy page 
     Then User updates privacy and save it
     
@Justtest
Scenario: Guest searchs 2 bed apartment around VA  
     And Guest enters "Virginia, VA"
     And Guest enters check-in date and check-out date 
     And Guest selects the number of beds
     When Guest clicks search button
        
        
        
        