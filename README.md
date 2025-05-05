# XCartShopSelenium

Simple Selenium test suite on user account registration/login/logout, account information update, user address addition/update/removal, single category product display view, product addition to compare list, basic product addition to cart/checkout, order submission validation, product return. The test suite captures screenshots at the end of test case run (for logging purposes). Since the password edit functionality and account removal functionality are non-operational (they both throw 403 error) in this demo, their testing is omitted.

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List 

//user navigation to 'Register' page test

1.	//Test 001 -> navigate user to 'Register' page test

//valid user account creation test

1.	//Test 002 -> valid user account creation test

//invalid user account creation tests

//no singular input

1.	//Test 002a -> invalid user account creation test - no user first name
2.	//Test 002b -> invalid user account creation test - no user last name
3.	//Test 002c -> invalid user account creation test - no user email
4.	//Test 002d -> invalid user account creation test - no user password and confirm password

//too short singular input

1.	//Test 002e -> invalid user account creation test - too short user first name (1 char)
2.	//Test 002f -> invalid user account creation test - too short user last name (1 char)
3.	//Test 002g -> invalid user account creation test - too short user email
4.	//Test 002h -> invalid user account creation test - too short user password confirm password (3 chars)

//too long singular input

1.	//Test 002i -> invalid user account creation test - too long user first name (100 chars)
2.	//Test 002j -> invalid user account creation test - too long user last name (100 chars)
3.	//Test 002k -> invalid user account creation test - too long user email (100 chars -> name, domain)
4.	//Test 002l -> invalid user account creation test - too long user password and confirm password (50 chars)

//invalid singular input format

1.	//Test 002m -> invalid user account creation test - invalid first name input format (special symbols only)
2.	//Test 002n -> invalid user account creation test - invalid last name input format (special symbols only)
3.	//Test 002o -> invalid user account creation test - invalid email input format (missing '@')
4.	//Test 002p -> invalid user account creation test - existing email (used beforehand)

//valid edit user account data tests

1.	//Test 003 -> valid edit user account data test
2.	//Test 003a -> valid edit user account (with password) test

//invalid edit user account data tests (since password section testing throws 403 error in demo, its testing is postponed)


//no singular input

1.	//Test 003b -> invalid edit user account data test - no user first name
2.	//Test 003c -> invalid edit user account data test - no user last name
3.	//Test 003d -> invalid edit user account data test - no user email

//too short singular input

1.	//Test 003e -> invalid edit user account data test - too short user first name (1 char)
2.	//Test 003f -> invalid edit user account data test - too short user last name (1 char)
3.	//Test 003g -> invalid edit user account data test - too short user email (1 char -> name, domain)

//too long singular input

1.	//Test 003h -> invalid edit user account data test - too long user first name (100 chars)
2.	//Test 003i -> invalid edit user account data test - too long user last name (100 chars)
3.	//Test 003j -> invalid edit user account data test - too long user email (100 chars -> name, domain)

//invalid singular input format

1.	//Test 003k -> invalid edit user account data test - invalid user first name format (special symbols only)
2.	//Test 003l -> invalid edit user account data test - invalid user last name format (special symbols only)
3.	//Test 003m -> invalid edit user account data test - invalid user email format (missing '@')
4.	//Test 003n -> invalid edit user account data test - existing test email

//user account removal test

1.	//Test 003o -> user account removal test

//valid user address addition tests (there's no 'Remove address' button present so it's testing is aborted until it'll be present)

1.	//Test 004 -> valid user address addition test
2.	//Test 004a -> valid multiple user addresses addition test
3.	//Test 004b -> valid edit user address test

//invalid user address addition tests


//no singular input (the country by default is set to 'United States' and there are no blank options for country and state dropdown menus, therefore, their testing is canceled)

1.	//Test 004c -> invalid user address addition test - no user first name
2.	//Test 004d -> invalid user address addition test - no user last name
3.	//Test 004e -> invalid user address addition test - no user address
4.	//Test 004f -> invalid user address addition test - no user city
5.	//Test 004g -> invalid user address addition test - no user post code

//too short singular input

1.	//Test 004h -> invalid user address addition test - too short user first name (1 char)
2.	//Test 004i -> invalid user address addition test - too short user last name (1 char)
3.	//Test 004j -> invalid user address addition test - too short user address (4 chars)
4.	//Test 004k -> invalid user address addition test - too short user city (2 chars)
5.	//Test 004l -> invalid user address addition test - too short user post code (4 digits)

//too long singular input

1.	//Test 004m -> invalid user address addition test - too long user first name (100 chars)
2.	//Test 004n -> invalid user address addition test - too long user last name (100 chars)
3.	//Test 004o -> invalid user address addition test - too long user address (100 chars)
4.	//Test 004p -> invalid user address addition test - too long user city (75 chars)
5.	//Test 004q -> invalid user address addition test - too long user post code (6 digits)

//invalid singular input format

1.	//Test 004r -> invalid user address addition test - invalid user first name format (special symbols only)
2.	//Test 004s -> invalid user address addition test - invalid user last name format (special symbols only)
3.	//Test 004t -> invalid user address addition test - invalid user address format (special symbols only)
4.	//Test 004u -> invalid user address addition test - invalid user city format (special symbols only)
5.	//Test 004v -> invalid user address addition test - invalid user post code format (special symbols only)

//valid user logout test

1.	//Test 005 -> valid user logout test

//valid user login tests

1.	//Test 006 -> valid user login test
2.	//Test 006a -> valid user login with edited email test

//invalid login tests


//no singular input

1.	//Test 006b -> invalid user login test - no login email
2.	//Test 006c -> invalid user login test - no login password

//invalid singular input

1.	//Test 006d -> invalid user login test - invalid login email
2.	//Test 006e -> invalid user login test - invalid login password

//single featured product addition to cart tests

1.	//Test 007 -> add single featured product ("Iphone 5c") to cart test (as a guest)
2.	//Test 007a -> add single featured product ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)

//multiple featured products addition to cart tests

1.	//Test 007b -> add multiple featured products ("Iphone 5c") to cart test (as a guest)
2.	//Test 007c -> add multiple featured products ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)

//single searched product addition to cart tests

1.	//Test 007d -> add single searched product ("AMD A10-5800K") to cart test (as a guest)
2.	//Test 007e -> add single featured product ("R/C Desktop Forklift") to cart test (as a registered user)

//multiple searched products addition to cart tests

1.	//Test 007f -> add multiple searched products ("AMD A10-5800K") to cart test (as a guest)
2.	//Test 007g -> add multiple searched product ("R/C Desktop Forklift") to cart test (as a registered user)

//single product addition from products map to cart tests

1.	//Test 008 -> add single product ("Antec Nine Hundred ATX Gaming Case") from products map to cart test (as a guest)
2.	//Test 008a -> add single product ("Apple Dock Connector to USB Cable") from products map to cart test (as a registered user)

//multiple products addition from products map to cart tests

1.	//Test 008b -> add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to cart test (as a guest)
2.	//Test 008c -> add multiple products ("iMac") from products map to cart test (as a registered user)

//single product addition from single product page to cart tests

1.	//Test 009 -> add single product ("Digital Angel") from single product page to cart test (as a guest)
2.	//Test 009a -> add single product ("Digital Angel") from single product page to cart test (as a registered user)

//multiple products addition from single product page to cart tests

1.	//Test 009b -> add multiple products ("Digital Angel") from single product page to cart test (as a guest)
2.	//Test 009c -> add multiple products ("Digital Angel") from single product page to cart test (as a registered user)

//product addition from single product page to wishlist tests

1.	//Test 009d -> add single product ("Digital Angel") from single product page to wishlist test (as a registered user)
2.	//Test 009e -> add multiple products ("Digital Angel") from single product page to wishlist test (as a registered user)

//single product addition to cart tests

1.	//Test 010 -> add single category product ("Anna Karenina") to cart test (as a guest)
2.	//Test 010a -> add single category product ("Anna Karenina") to cart test (as a registered user)

//single category multiple products addition to cart tests

1.	//Test 010b -> add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to cart test (as a guest)
2.	//Test 010c -> add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to cart test (as a registered user)

//product addition to wishlist tests

1.	//Test 011 -> add single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to wishlist test (as a registered user)
2.	//Test 011a -> add multiple featured products ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to wishlist test (as a registered user)

//product addition to cart from wishlist test

1.	//Test 011b -> add single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to cart from wishlist test (as a registered user)
2.	//Test 011c -> add multiple featured products ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to cart from wishlist test (as a registered user)

//product quantity update in wishlist test

1.	//Test 011d -> update featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") quantity in wishlist test (as a registered user)

//product remove from wishlist test

1.	//Test 011e -> remove single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") from wishlist test (as a registered user)

//single featured product addition to check out tests

1.	//Test 012 -> add single featured product ("Iphone 5c") to check out test (as a guest)
2.	//Test 012a -> add single featured product ("Thumb-Size R/C Mini Cooper") to check out test (as a registered user) 

//multiple featured product addition to check out tests

1.	//Test 012b -> add multiple featured products ("Iphone 5c") to check out test (as a guest)
2.	//Test 012c -> add multiple featured products ("Thumb-Size R/C Mini Cooper") to check out test (as a registered user)

//single searched product addition to cart tests

1.	//Test 013 -> add single searched product ("AMD A10-5800K") to check out test (as a guest)
2.	//Test 013a -> add single featured product ("R/C Desktop Forklift") to check out test (as a registered user)

//multiple searched products addition to check out tests

1.	//Test 013b -> add multiple searched products ("AMD A10-5800K") to check out test (as a guest)
2.	//Test 013c -> add multiple featured product ("R/C Desktop Forklift") to check out test (as a registered user)

//single product page product addition to cart tests

1.	//Test 014 -> add single product page product ("Digital Angel") to check out test (as a guest)
2.	//Test 014a -> add single featured product ("Digital Angel") to check out test (as a registered user)

//multiple single product page products addition to check out tests

1.	//Test 014b -> add multiple single product page products ("Digital Angel") to check out test (as a guest)
2.	//Test 014c -> add multiple single product page products ("Digital Angel") to check out test (as a registered user)

//single product addition from products map to check out tests

1.	//Test 015 -> add single product ("Antec Nine Hundred ATX Gaming Case") from products map to check out test (as a guest)
2.	//Test 015a -> add single product ("Apple Dock Connector to USB Cable") from products map to check out test (as a registered user)

//multiple products addition from products map to check out tests

1.	//Test 015b -> add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to check out test (as a guest)
2.	//Test 015c -> add multiple products ("iMac") from products map to check out test (as a registered user)

//single category product addition to check out tests

1.	//Test 016 -> add single category product ("Anna Karenina") to check out (as a guest)
2.	//Test 016a -> add single category product ("Anna Karenina") to check out test (as a registered user)

//single category multiple products addition to check out tests

1.	//Test 016b -> add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to check out test (as a guest)
2.	//Test 016c -> add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to check out test (as a registered user)

//update product quantity in shopping cart test

1.	//Test 017 -> update featured product ("Iphone 5c") quantity during addition to check out test (guest branch is tested only to avoid redundancy -> registered user will have the same result)

//update product quantity in shopping cart test

1.	//Test 018 -> remove featured product ("Iphone 5c") quantity from shopping cart test (guest branch is tested only to avoid redundancy -> registered user will have the same result)

//move product from shopping cart to wishlist test

1.	//Test 019 -> move featured product ("Thumb-Size R/C Mini Cooper") from shopping cart to wishlist test (only registered user has this feature)

//single featured product check out confirmation test

1.	//Test 020 -> valid single featured product ("Iphone 5c") check out confirmation test (as a guest)

//single featured product check out confirmation test (billing and shipping address)

1.	//Test 020a -> valid single featured product ("Iphone 5c") check out (billing and shipping address) confirmation test (as a guest)

//multiple featured product check out confirmation tests

1.	//Test 020b -> add multiple featured products ("Iphone 5c") check out confirmation test (as a guest)
2.	//Test 020c -> add multiple featured products ("Iphone 5c") check out (billing and shipping address) confirmation test (as a guest)
3.	//Test 020d -> add multiple featured products ("Thumb-Size R/C Mini Cooper") check out confirmation test (as a registered user)

//single searched product check out confirmation tests

1.	//Test 021 -> single searched product with fax ordering payment method ("AMD A10-5800K") check out confirmation test (as a guest)
2.	//Test 021a -> add single featured product with shipping method example delivery method 2 selection ("R/C Desktop Forklift") check out confirmation test (as a registered user)

//multiple searched products check out confirmation tests

1.	//Test 021b -> multiple searched products with fax ordering payment method ("AMD A10-5800K") check out confirmation test (as a guest)
2.	//Test 021c -> multiple featured product with shipping method example delivery method 2 selection ("R/C Desktop Forklift") check out confirmation test (as a registered user)

//single product page product checkout confirmation tests

1.	//Test 022 -> add single product page product ("Digital Angel") check out confirmation test (as a guest)
2.	//Test 022a -> add single featured product ("Digital Angel") check out confirmation test (as a registered user)

//multiple single product page products check out confirmation tests

1.	//Test 022b -> add multiple single product page products ("Digital Angel") check out confirmation test (as a guest)
2.	//Test 022c -> add multiple single product page products ("Digital Angel") check out confirmation test (as a registered user)

//single product (from products map) check out confirmation tests

1.	//Test 023 -> single product ("Antec Nine Hundred ATX Gaming Case") (products map) check out confirmation test (as a guest)
2.	//Test 023a -> single product ("Apple Dock Connector to USB Cable") (products map) check out confirmation test (as a registered user)

//multiple products addition (from products map) check out confirmation tests

1.	//Test 023b -> add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") (from products map) check out confirmation test (as a guest)
2.	//Test 023c -> add multiple products ("iMac") (from products map) to check out test (as a registered user)

//single category product check out confirmation tests

1.	//Test 024 -> single category product ("Anna Karenina") check out confirmation (as a guest)
2.	//Test 024a -> single category product ("Anna Karenina") check out confirmation test (as a registered user) (with shipping method example delivery method 2 selection)

//single category multiple products check out confirmation tests

1.	//Test 024b -> multiple single category products with example shipping delivery method 1 and money order payment method ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") check out confirmation test (as a guest)
2.	//Test 024c -> multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") (with shipping method example delivery method 2 selection) check out confirmation test (as a registered user)

//invalid guest checkout tests (since the input forms don't allow missing inputs, no singular input testing is redundant)

//too short singular input

1.	//Test 025 -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing first name (1 char)
2.	//Test 025a -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing last name (1 char)
3.	//Test 025b -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing address (4 chars)
4.	//Test 025c -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing city (2 chars)
5.	//Test 025d -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing post code (4 digits)
6.	//Test 025e -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing email (1 char -> name, domain)
7.	//Test 025f -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping first name (1 char)
8.	//Test 025g -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping last name (1 char)
9.	//Test 025h -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping address (4 chars)
10.	//Test 025i -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping city (2 chars)
11.	//Test 025j -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping post code (4 digits)

//too long singular input

1.	//Test 025k -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing first name (100 chars)
2.	//Test 025l -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing last name (100 chars)
3.	//Test 025m -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing address (100 chars)
4.	//Test 025n -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing city (75 chars)
5.	//Test 025o -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing post code (6 digits)
6.	//Test 025p -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing email (100 chars -> name, domain)
7.	//Test 025q -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping first name (100 chars)
8.	//Test 025r -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping last name (100 chars)
9.	//Test 025s -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping address (100 chars) 
10.	//Test 025t -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping city (75 chars)
11.	//Test 025u -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping post code (6 digits)

//invalid singular input format

1.	//Test 025w -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing first name format (special symbols only)
2.	//Test 025x -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing last name format (special symbols only)
3.	//Test 025y -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing address format (special symbols only)
4.	//Test 025z -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing city format (special symbols only)
5.	//Test 025aa -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing post code format (special symbols only)
6.	//Test 025ab -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing email format (special symbols only)
7.	//Test 025ac -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - existing billing test email
8.	//Test 025ad -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping first name format (special symbols only)
9.	//Test 025ae -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping last name format (special symbols only)
10.	//Test 025af -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping address format (special symbols only)
11.	//Test 025ag -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping city format (special symbols only) 
12.	//Test 025ah -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping post code format (special symbols only)
