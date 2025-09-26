\# 📝 Android To-Do App (Java | API 24+)



A simple \*\*To-Do List Application\*\* built using \*\*Java\*\* for Android (Minimum SDK 24 - Android 7.0 Nougat).  

This app allows users to \*\*Add\*\*, \*\*Edit\*\*, \*\*View\*\*, and \*\*Delete\*\* tasks — while syncing task data locally via \*\*SQLite\*\* and supporting \*\*Firebase Cloud Messaging\*\* for future cloud notifications.



---



\## 📱 Screenshots



| Task List | Empty State |

|------------|-------------|

| <img src="Github_app_img_ss/img1.png" width="300"/> | <img src="Github_app_img_ss/img2.png" width="300"/> |



---



\## ⚙️ Features



✅ \*\*Add Task\*\* – Save tasks locally using SQLite database.  

✅ \*\*View Tasks\*\* – Display all tasks stored in the database.  

🚧 \*\*Edit Task\*\* – Functionality in progress (plays a sound when clicked).  

🚧 \*\*Delete Task\*\* – Feature yet to be completed.  

☁️ \*\*Firebase Cloud Messaging\*\* – Integrated for push notifications.  

🎵 \*\*Sound Trigger\*\* – A song is stored in `/res/raw/` and plays when the Edit button is clicked.  



---



\## 🧱 Tech Stack



| Component | Description |

|------------|-------------|

| \*\*Language\*\* | Java |

| \*\*Database\*\* | SQLite (local storage) |

| \*\*Cloud\*\* | Firebase Cloud Messaging (for notifications) |

| \*\*UI Framework\*\* | Android XML |

| \*\*Min SDK\*\* | API 24 (Android 7.0) |



---



\## 📂 Project Structure



<details>

<summary>Click to expand project layout</summary>



app/

├── 📁 java/

│ └── com.example.todoapp/

│ ├── 📄 MainActivity.java → Main screen (Add/Edit/View/Delete)

│ ├── 📄 DatabaseHelper.java → Handles SQLite CRUD operations

│ ├── 📄 TaskModel.java → Task data model class

│ └── 📄 FirebaseService.java → Firebase Cloud Messaging setup

│

├── 📁 res/

│ ├── 📁 layout/

│ │ └── 🧩 activity\_main.xml → UI design for the main activity

│ │

│ ├── 📁 raw/

│ │ └── 🎵 editsound.mp3 → Plays when Edit Task button is clicked

│ │

│ ├── 📁 values/

│ │ └── 🎨 colors.xml, strings.xml → App colors and strings

│ │

│ └── 📁 drawable/

│ └── 🖌️ button\_background.xml → Custom style for buttons

│

└── 📄 AndroidManifest.xml → App permissions and components





</details>





---



\## 🔥 Firebase Integration



1\. Added Firebase to the project via `google-services.json`.

2\. Enabled \*\*Firebase Cloud Messaging\*\* for push notifications.

3\. Future plan: Sync task data to Firebase Realtime Database for multi-device access.



---



\## 🗄️ SQLite Database



\- Used for local data persistence.  

\- Each task record includes:

&nbsp; - Task Name

&nbsp; - Task Description



---



\## 🚀 Future Enhancements



\- Complete \*\*Edit\*\* and \*\*Delete\*\* functionalities.  

\- Add \*\*notification reminders\*\* using Firebase Cloud Messaging.  

\- Implement \*\*RecyclerView\*\* for better task display.  

\- Add \*\*dark mode\*\* and \*\*task categories\*\*.



---



\## 🧑‍💻 Developer



\*\*Developed by:\*\* Utkarsh Pandey  

\*\*Language:\*\* Java  

\*\*Platform:\*\* Android Studio  

\*\*Target SDK:\*\* 34  



---



> 🎧 \*"Because productivity feels better with a tune!"\*  

Sound effect triggered on Edit button is placed in:  

`app/src/main/res/raw/editsound.mp3`



---







