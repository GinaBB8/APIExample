# API-Driven  Process Automation 
## Project Overview 
This repository contains some simple Java code; it is a proof-of-concept which demonstrates the use of API-Driven Process Automation. The goal was to ensure that I clearly demonstrated how an automated workflow can retrieve data from
an external API at scheduled intervals without any sort of manual intervention. The project overall was part of a structured learning journey which explored:
- API integration
- Automated processes
- GitHub
- AI-assisted learning and problem-solving

  ## What the solution does
  The Java program runs the following automated workflow:
  1. Runs scheduled tasks every 6 seconds 
  2. Sends GET request to a public API, which is jsonplaceholder.typpicode.com
  3. Retrieves a JSON response 
  4. Prints said response and timestamps it to the console 
  5. Then repeats it continuously without human input
 
  Which simulates a real-world automation scenario such as
- Monitoring a service
- Polling endpoint
- Triggers downstream processes
- Collects data for reporting
 
    ## AI Assisted Learning
Throughout the project, AI tools were used for the purpose of helping to help break down unfamiliar concepts. In this instance, it was API Integrations. To also provide examples and explanations of the concepts' usage
and growing pains that can be caused in the process. A key area of the use of AI assistance was to guide the proof-of-concept and support upon documenting and reflecting.

## Code Summary 
*Below, I will be providing a high-level summary of the program's structure*
## Main Components 
- Timer and a TimerTask
  - which was used to schedule the repeated automated execution
- HttpURLConnection
  - It handles the API request
- Buffer Reader
  - Reads the API response
- StringBuilder
  - Stores the JSON output

## Summary 
This project demonstrates a simple proof-of-concept for an API-driven process automation, which demonstrates how a Java Program can automatically retrieve and process data from an external API at scheduled intervals.
Without the need for manual intervention. Throughout the development of this solution, I used AI tools to help break down unfamiliar concepts, clarify the logic behind automated workflows and provide me with guidance when structuring 
The code is in a clear and maintainable way. AI support has also played a key role in troubleshooting issues, understanding best practices and documenting the overall learning process. Although API integration is not something I currently use
in my role, this project has ultimately allowed me to explore new technical skills, strengthen my understanding of automation principles, and build confidence in applying AI-assisted learning to develop practical, work-relevant solutions.

    
