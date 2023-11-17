
Feature: BDD1-2 Direct to CURA Hospital

 
  Scenario: Direct to page CURA Hospital
    Given User buka browser
    When User input url website CURA Hospital
    Then User akan ditampilkan halaman CURA Hospital
    And User akan ditampilkan button make appointment di halaman beranda
    
    #Examples:
#		|action |                                 dataset|
#		|browser|                                        |
#		|CURA   |https://katalon-demo-cura.herokuapp.com/|