# Blood Bank Management System
Our project is based on blood bank management system. It will help in keeping and tracking records for blood samples collected from donor at a medical and store the blood in blood bank.

# Executable File
Executable Jar file can be found in 
Blood Bank Management System\dist\Blood_Bank_Management_System

# External Library
Two expternal module was used in this project
JCalander :-- included and copied into project for rendering date and time UI Component

MySQL Connector :-- included in library folder for esablishing connection with mysql database.

# Project modules
Path :-- Blood Bank Management System\src\BBMS\
1. Controller 
    contains Java Classes
        ConnectionProvider: For Esablishing connection with database
        AddNewDonor: Adding New Donor to the database
        AllDonorDetails: Fetching All Donor's details from database
        DeleteDonor: Deleting existing donor from the database
        UpdateDonorDetails: Updating existing donor details
        SearchBloodDonorByBloodGroup: Fetching donor details with specified blood group
        SearchBloodDonorByLocation: Fetching donor details with specified location
        SearchBloodDonorByCovidStatus: Fetching donor details with specified covid status
        StockIncrease: Posting new available stock to the database
        StockDecrease: Posting new available stock to the database
        StockDetails: Fetching all stocks details form database

2. Model
    contains 
        Donor Class
        Stock Class
3. Resources
    Contains 
        All the resources used in this project 
        Background Images / Button Icon Images
4. View
    Contains
        Home Class: UI Component Class for Home Interface
        Login Class: UI Component Class for Login Interface