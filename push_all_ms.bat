@echo off
setlocal

REM Set your GitHub username
set USERNAME=Patel1313

REM Base path where your microservices are located
set BASEPATH=C:\Users\Patel_1313\Desktop\Voting & Polling Platform

REM List of microservices (folder names)
set REPOS=data-input-service registration-service voting-service polling-service result-service messaging-service others-service gateway-service discovery-server

for %%R in (%REPOS%) do (
    echo ==============================
    echo Processing %%R
    echo ==============================

    REM Navigate to local folder
    cd /d "%BASEPATH%\%%R"

    REM Initialize git if not already
    if not exist ".git" (
        git init
    )

    REM Add all files
    git add .
    git commit -m "Initial commit - %%R"

    REM Remove existing origin if any
    git remote remove origin 2>nul

    REM Add GitHub remote
    git remote add origin https://github.com/%USERNAME%/%%R.git

    REM Push to GitHub
    git branch -M main
    git push -u origin main
)

echo All microservices pushed successfully!
pause
