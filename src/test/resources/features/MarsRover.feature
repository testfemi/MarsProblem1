Feature: Mars Rovers
  As a NASA engineer
  I want to control rovers on Mars plateau
  So that I can explore the surrounding terrain

  @a
  Scenario: Rover direction and positioning initialization
    Given a plateau with upper-right coordinates 5 5
    And a rover positioned at 1 2 N
    Then the rover's position should be 1 2 N

  @b
  Scenario: Move Rover X and Y Position
    Given a rover positioned at 2 3 N
    When the rover moves with the command "MMRMM"
    Then the rover's position should be 4 5 E
    #Then the rover's position should be 4 5 N
  @c
  Scenario: Move the Rover as per the given scenario problem
    Given a plateau with upper-right coordinates 5 5
    And a rover positioned at 1 2 N
    When the rover moves with the command "LMLMLMLMM"
    Then the rover's position should be 1 3 N

