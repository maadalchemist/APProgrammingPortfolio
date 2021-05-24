# AP Computer Programming Portfolio

Joseph Wardle

<josephwardle02@gmail.com>

---
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
![class_diagram](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/StockInvestor/doc/classDiagram.png)

---
## Example Output
![example_output](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/StockInvestor/doc/example_output.png)

---
# Minesweeper RPG

![icon](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/MinesweeperRPG/doc/icon.png)

Minesweeper RPG is a game where you control an actual ship out sweeping mines. Rather than the traditional, limited map size, this game features a procedurally generated map, turning a time trial game into an endless arcade game.

This project was a way for me to explore data structures, procedural generation, and shaders. This was NOT a project focused on visual assets. As such, all graphics are only barely above the bare minimum in terms of visual appeal. THis may change in the future, but for now, it looks as is.

## How to play
The arrow keys are used for movement. The up and down arrow keys move the craft forward and backwards, and the left and right arrow keys turn the craft. A tile in front of the ship if marked in yellow. 

![target_reference](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/MinesweeperRPG/doc/target_reference_screencap.png)

Clicking 'z' will reveal that tile, and clicking 'x' will flag that tile. 

 A revealed tile will display how many mines are adjacent to it. The play must use that information to determine where mines are and either flag them or avoid revealing them.

## Generation Proccess

After messing around with several generation ideas, the solution i landed on was chunk based using two-dimentional simplex noise. The world is divided into tiles 16x16 in size. A dictionary stores the identity of every tile, with states of "SAFE", "ONE", "TWO", ... "EIGHT", and "MINE". These tiles are further bunched into chunks, which contain 16x16 tiles. A separate dictionary contains the generation status of chunks, with states of "RED", "YELLOW", and "GREEN". 

A chunk in the "RED" state is completely blank. To become "YELLOW" it gets populated with mines according to a simplex noise pattern generated at the start of the game. However, the edges of these chunks would be calulated incorrectly if a real query were to occur, so to complete generation and become "GREEN", all neighboring tiles must be either "YELLOW" or "GREEN".

when the chunk dicitonaries are exported as a png image, you can get an idea of how these chunks work:

![chunk_visualization](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/MinesweeperRPG/doc/chunk_generation_visualization.png)

## Shaders

The water shader took a ton of work. It is completely procedurally generated with no input textures. Only pure math. 

First the shader transforms the UV position of the object into worldspace coordinates. This is so that the water object being shaded can be limited to just the camera space, but still seem to move independantly of the camera. In order to make the shader tileable, the shader then determins the tile the current pixel resides in. It will then generate a random point in the tile, and move that point periodically with time. The shader then goes through neighboring tiles, including the current tile, in order to determin the closest point to the currently rendering pixel, with white being farther and black being nearer. The brightness of the pixel is then determined based on the distance to the nearest point. This black and white value is then shifted to color, with white being adjusted towards one color and black towards another.

There is also a grid shader to differentiate tiles, which uses the same tiling techniques of the water shader.

## Class Diagram

Only variables and methods I created are presented in this diagram, becasue we would be here all day if I listed what the Godot engine handles. In addition, any simple methods or variables are left out in order to present important methods more prominantly. Also, because GDScript is a dynamic language, return types have been left off of methods as many of them are dynamic in nature

![class_diagram](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/MinesweeperRPG/doc/classDiagram.png)

---
# Basic Console Calculator

This short app can be used as a basic calculator. It prints a welcome statement to the console, then asks user for first number and saves the input as a numeric variable. It then asks user for an operator ( +, -, \*, or /). At that point is asks user for second number and saves the input as a numeric variable, and prints thye answer. It wwill then prompt the user whether or not they would like to make another calculation

---
## Example Usage

![example](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/Basic%20Console%20Calculator/java/example_output.png)

--- 
# Hangman

This does exactly what you would expect it to. I will randomly select a word from a hardcoded list and play hangman with the user in the console. 

## Example Usage

![example](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/Hang%20man/Screenshot%202021-05-24%20171203.png)

## Flowchart

Logic was constructed based off of this flowchart:

![flowchart](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/Hang%20man/Hangman%20Flowchart.png)

---
# Ceasar Cypher

This program encrypts a file using the Caesar cipher.

Usage: java CaesarCipher [-d] infile outfile

Example input:
> My name is Kira Yoshikage.
> I'm 33 years old.
> My house is in the northeast section of Morioh, where all the villas are, and I am not married.
> I work as an employee for the Kame Yu department stores, and I get home every day by 8 PM at the latest.
> I don't smoke, but I occasionally drink.
> I'm in bed by 11 PM, and make sure I get eight hours of sleep, no matter what.
> After having a glass of warm milk and doing about twenty minutes of stretches before going to bed, I usually have no problems sleeping until morning.
> Just like a baby, I wake up without any fatigue or stress in the morning.
> I was told there were no issues at my last check-up.
> I'm trying to explain that I'm a person who wishes to live a very quiet life.
> I take care not to trouble myself with any enemies, like winning and losing, that would cause me to lose sleep at night.
> That is how I deal with society, and I know that is what brings me happiness. 
> Although, if I were to fight I wouldn't lose to anyone.

Example output: 
> Cx ueaw vf Siqq Sqsyjycbi.
> D'f 33 fmadk gmt.
> Hm ktnnp il sj qkf nustkmosl ocwkywj xz Mmlcgj, ekqtk frt gbw yzwfwk haj, dpi R wj ydo vaxeaai.
> X ackq ln wu aiqrhokh whw fff Wiox Tf ojhqzuoxsm fcmpnx, bty M hqc jbfa lawvb xwj ed 8 RW pq nwr dwlmbz.
> I qya'r pfkjy, cir U qhbemfpgnqqd kbgub.
> F'h hf wgm hr 11 LG, frv ihbk wniw D smz efrjf wovdv vh scqoc, kr zazwjg kleh.
> Sdnms bazcza w ppiua sq nwhv vltc gym xzsca iulbp uustnz kaevatz vr jajraycgx hdifjx efngz vb edx, N bnjpjvi gsqy tw fivpiigk wjwocrms sulsx kjtvheo.
> Fgxx krnb n tevy, U diwb vh irmimnq cqq vxemxks bb jnsppv ov ggf awrcybh.
> R hgs kafp rkmcs sjse no qnzxrb yj ka nfcr uiaqn-dt.
> O'l fadjks ge jzsuhvj btio E'f l blbagf ukx kzxhaz hb udbt j xcpa qrdyj wjeo.
> Q ftkl cccs utz rg osonevm briyen qxff kyk sekiyhd, txrb xqqkdvw syy byizsq, ydbv dztoo lipur oe vz rhvt rcwap cv fvvqw.
> Rzhw dr wah W byfw qfzg sbsvsxk, crz N zxcw ycul cl bjef smnnny qb qwuszekda. 
> Jtyzaxxg, hs B hrpr cq scwtp W puikik'n bzof uo jeimku.

---
# Recursion Testing

This simple program compares the effectiveness of a recursive and iterative method for the calculation of the Fibbinacci series and factorials. This extensive expirament uses the BigInteger class in order to calculate numbers far beond the limit of the Integer datatype. It was determined that neither function was significantly more efficient with the factorial calculations, but that the iterative approach to the Fibbinacci series is significantly faster.

Here is a screenshot of what the porgram looks like when completed:

![example](https://github.com/maadalchemist/APProgrammingPortfolio/blob/master/Recursion%20Testing/console_example.png)
