# Tanker app

This console app estimates how many 11,000 gallon takers of water someone will consume in their lifetie given an estimated lifetime

## Psudocode

### Problem Statement
This app will estimate how many 11,000 gallon tanker trucks a human will consume in fluids providing an average amount of ounces consumed per day and a custom number representing an estimated longevity in years.

### Inputs and Outputs
water_oz_per_day, 
lifespan_yrs

tankers_consumed

### Tasks
* get input
* calculate gallons_consumed
* return gallons_consumed

### Sub-task Pseudocode
* print welcome message
* ask for lifespan
* GET INPUT: lifespan_yrs
* tankers_consumed equals water_oz_per_day multiplied by 365 (to get oz/year) divided by 128 (to get gallons per year) multiplied by lifespan_yrs
* print answer

### Test example
* print welcome message
* ask for lifespan
* GET INPUT: lifespan_yrs
  * lifespan is 70
* tankers_consumed equals water_oz_per_day multiplied by 365 (to get oz/year) divided by 128 (to get gallons per year) multiplied by lifespan_yrs divided by 11,000
  * tankers_consumed = water_oz_per_day * 365 / 128 * 70 / 11,000
* print answer
  * you would consume ___ 11,000 gallon tankers in your lifetime!
