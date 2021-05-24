# AP Computer Programming Portfolio

Joseph Wardle
<josephwardle02@gmail.com>

--
# Stock Market Game Investor

![alt text](http://www.stockmarketgame.org/img/horizontal_logo_lg.png "StockMarketGame")

###### Skyline's automated stock investor app to compete in the semi-annual student based stock market game. All logic and business rules must conform to the [StockMarketGame](http://www.stockmarketgame.org "Documentation").

---
## Project Description:
  * App is designed to run unattended on a Raspberry Pi through the real date of the Stock Market Game
  * App decides when to purchase and sell stocks throughout the ten week period based on live stock data, starting with $100,000 fake dollars.
  * App reports balances and runtime stats via email daily.
  * App will write to log files that track all automated buy/sell decisions made.
  * Stock Market Game runs from February 1 to April 9

---
## Yahoo Finance API

The official Yahoo Finance API was discontinued in 2017. However, we found an unofficial java API called yahoofinance-api that should suit our needs. This API can be found at https://github.com/sstrickx/yahoofinance-api. This API is a vital component of the project as it is responsible for getting any stock data. It took many hours of work to impliment and incorperate this API into the systems, and the final result is quick and efficient.

---
## JavaMail API and JAF

The combination of the JavaMail API and the Javabeans API is used to send emails. It sends the entire history of the project's runtime to us at the cosing of the stock market every day

---
## Other API information

Unfortunately, there is no API to work with the Stock Market Game. Building an API from scratch is beyond the scope of our project, so rather than interact with the Stock Market Game directly, we will store stock information and profits internally.

---
## Buying and Selling Systems and Algorithms

This program works of a very simple algorithm that runs on a timer or 10 minutes. At the end of the timer, and assuming the stock market is open, The algorithm will determin the 5 best stocks to purchased based off of their percentage delta at the time of query. It will then sell every one of its stocks not on that list, and purchase as many of those stocks as it can afford to.

---
## Class Diagram
![class_diagram]()

---
## Example Output
![example_output]()

![icon]()

# Minesweeper RPG

Minesweeper RPG is a game where you control an actual ship out sweeping mines. Rather than the traditional, limited map size, this game features a procedurally generated map, turning a time trial game into an endless arcade game.

This project was a way for me to explore data structures, procedural generation, and shaders. This was NOT a project focused on visual assets. As such, all graphics are only barely above the bare minimum in terms of visual appeal. THis may change in the future, but for now, it looks as is.

## How to play
The arrow keys are used for movement. The up and down arrow keys move the craft forward and backwards, and the left and right arrow keys turn the craft. A tile in front of the ship if marked in yellow. 

![target_reference]()

Clicking 'z' will reveal that tile, and clicking 'x' will flag that tile. 

 A revealed tile will display how many mines are adjacent to it. The play must use that information to determine where mines are and either flag them or avoid revealing them.

## Generation Proccess

After messing around with several generation ideas, the solution i landed on was chunk based using two-dimentional simplex noise. The world is divided into tiles 16x16 in size. A dictionary stores the identity of every tile, with states of "SAFE", "ONE", "TWO", ... "EIGHT", and "MINE". These tiles are further bunched into chunks, which contain 16x16 tiles. A separate dictionary contains the generation status of chunks, with states of "RED", "YELLOW", and "GREEN". 

A chunk in the "RED" state is completely blank. To become "YELLOW" it gets populated with mines according to a simplex noise pattern generated at the start of the game. However, the edges of these chunks would be calulated incorrectly if a real query were to occur, so to complete generation and become "GREEN", all neighboring tiles must be either "YELLOW" or "GREEN".

when the chunk dicitonaries are exported as a png image, you can get an idea of how these chunks work:

![chunk_visualization]()

## Shaders

The water shader took a ton of work. It is completely procedurally generated with no input textures. Only pure math. 

First the shader transforms the UV position of the object into worldspace coordinates. This is so that the water object being shaded can be limited to just the camera space, but still seem to move independantly of the camera. In order to make the shader tileable, the shader then determins the tile the current pixel resides in. It will then generate a random point in the tile, and move that point periodically with time. The shader then goes through neighboring tiles, including the current tile, in order to determin the closest point to the currently rendering pixel, with white being farther and black being nearer. The brightness of the pixel is then determined based on the distance to the nearest point. This black and white value is then shifted to color, with white being adjusted towards one color and black towards another.

There is also a grid shader to differentiate tiles, which uses the same tiling techniques of the water shader.

## Class Diagram

Only variables and methods I created are presented in this diagram, becasue we would be here all day if I listed what the Godot engine handles. In addition, any simple methods or variables are left out in order to present important methods more prominantly. Also, because GDScript is a dynamic language, return types have been left off of methods as many of them are dynamic in nature

![class_diagram]()
