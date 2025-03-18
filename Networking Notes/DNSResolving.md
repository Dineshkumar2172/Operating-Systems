# 🌍 DNS (Domain Name System) – How Domain Names Are Resolved to IP Addresses

## What is DNS?
When you enter `google.com` in your browser, your computer **doesn't understand domain names**. It needs an **IP address** (like `142.250.182.14`) to find and connect to the correct server.  

**DNS is like a phonebook** 📖 of the internet that translates domain names into IP addresses.

---

## 🛠 Step-by-Step: How DNS Works

### 1️⃣ You Enter `google.com` in Your Browser
   - Your computer checks if it already knows the IP address (stored in a cache).
   - If not, it asks a **DNS resolver** (usually from your ISP or a public one like Google `8.8.8.8`).

### 2️⃣ The DNS Resolver Looks for the IP Address
   - If it **has it stored**, it sends it back immediately. ✅  
   - If **not**, it **asks the Root DNS Server** 📍.

### 3️⃣ The Root DNS Server Directs the Request
   - The **Root server** doesn’t know the IP but tells your resolver,  
     *"Hey! Ask the `.com` server for `google.com`."*  

### 4️⃣ The TLD (Top-Level Domain) Server Helps
   - The **`.com` server** responds,  
     *"I don’t have it, but ask Google’s DNS server!"*  

### 5️⃣ The Authoritative Name Server Gives the Answer
   - Google's DNS **knows** its own IP and responds,  
     *"The IP address of `google.com` is `142.250.182.14`."*  

### 6️⃣ Your Browser Connects to the Website!
   - Now, your browser uses that **IP address** to send a request to **Google’s server**.  
   - Google’s server responds, and you see the website! 🎉  

---

## 🔥 Analogy: DNS = Phonebook
Imagine you want to call a friend **(Google)**, but you don’t know their phone number **(IP Address)**.  

You:
1️⃣ Check your phone’s contacts **(Local Cache)**.  
2️⃣ If not found, ask a directory service **(DNS Resolver)**.  
3️⃣ The service directs you to a department **(Root Server)**.  
4️⃣ The department sends you to a local branch **(TLD Server)**.  
5️⃣ The local branch finds the number **(Authoritative Server)** and gives it to you.  
6️⃣ You dial the number **(Browser connects to the website)**.  

---

## 🗂 DNS Records (Important Types)
📌 **A Record** – Maps domain to an IPv4 address (like `142.250.182.14`).  
📌 **AAAA Record** – Maps domain to an IPv6 address.  
📌 **CNAME Record** – Makes one domain an alias for another (`www.example.com` → `example.com`).  
📌 **MX Record** – Used for emails (Mail eXchange).  
📌 **TXT Record** – Holds text info (used for security like SPF, DKIM).  

---

This is how **DNS** resolves domain names to IP addresses! 🚀
