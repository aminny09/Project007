@userPage
Feature:UserPage
  I want to create channel and post validate in userPage

  Scenario Outline: I want to verify channel name exist, channel create validation and user post & time validate
    Given I have <userName> and <passWord> for the login page
    And click the signin button
    When create a channel <channelName> under the channels in userPage
    Then I want to verify <channelName>channel name in the channels
    When I want delete the channel and verify the channel name exist
    And I want to write post <postStatus>on the user page
    Then I want to validate post<postStatus> in userPage

    Examples: 
      | userName               | passWord     | channelName        | postStatus                 |
      | " aminny570@yahoo.com" | "Amin308101" | "qatestingchannel" | "welcome to qa automation" |
