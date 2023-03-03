@smokeTest
  Feature:Open Chrome browser

    Scenario: Open the Chrome browser and Enter the Flipkart
      Given launch the Chrome browser
      And Open the Flipkart
      When Select the any one Product
      And verify the Product in cart page
      Then Check out the Order
      Then logout the Flipkart

