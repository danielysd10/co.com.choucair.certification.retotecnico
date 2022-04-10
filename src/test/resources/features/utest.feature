# Autor: Daniel Duque
@stories
Feature: uTest
  As a user,I want to enter the uTest community to
  know the functionalities of the site

  @scenario1
  Scenario: Register in the uTest platform
    Given than Daniel want to know the sities uTest

    When  entering the data from the uTest registration form
      | first_name    | last_name   | email_address     | month_birth | day_birth | year_birth | city       |  postal_code | country  | your_computer| version | language | your_mobile_device| model | operating_system | password | password_confirmation |
      | daniel        | giraldo     | daniel@utest.com  | July        | 28        | 1991       | Medellín   |  110111      | Colombia | Windows | Windows 10 | Spanish | Huawei | Mate 9 Pro | Android 9.0 (Pie) | Daniel.giraldo180 | Daniel.giraldo180 |

    Then  he Know the functionalities of the uTest

      | welcome |
      | Welcome to the world's largest community of freelance software testers! |
