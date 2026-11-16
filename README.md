# BookMate Android Cloud Build Starter

This repository is a **buildable starter scaffold**, not the finished BookMate reader.

## Build APK on GitHub
1. Create a GitHub repository named `BookMate-Android`.
2. Upload the contents of this ZIP (not the ZIP file itself) to the repository root.
3. Open the repository's **Actions** tab.
4. Select **Build BookMate Android APK** and press **Run workflow** (or wait for the first push workflow).
5. When the run completes, open it and download the `BookMate-debug-apk` artifact.

## Current scope
- Android Kotlin + Jetpack Compose starter screen.
- GitHub Actions workflow to build a debug APK.
- EPUB/PDF reading, realistic page curl, Myanmar translation, OCR, bookmarks and notes are **not implemented yet**.
- This debug APK is for installation/testing only; it is not a signed Play Store release.

Never upload signing keys, passwords, API keys, or access tokens to a public repository.
