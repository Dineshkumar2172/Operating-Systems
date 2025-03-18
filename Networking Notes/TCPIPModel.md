# TCP/IP Model

## Overview
The **TCP/IP Model** (Transmission Control Protocol/Internet Protocol) is a conceptual framework used to describe how data is transmitted over a network. It is a more practical and simplified model compared to the OSI Model and consists of **four layers**.

## Layers of the TCP/IP Model

### 1. **Application Layer**
- Closest to the user, it defines protocols for communication over the network.
- Handles **application-level protocols** like:
  - **HTTP/HTTPS** (Web Browsing)
  - **FTP** (File Transfer)
  - **SMTP/IMAP/POP3** (Email)
  - **DNS** (Domain Name Resolution)
  - **WebSockets** (Real-time communication)

### 2. **Transport Layer**
- Responsible for end-to-end communication and data flow control.
- Uses two main protocols:
  - **TCP (Transmission Control Protocol)**
    - Connection-oriented, reliable data transfer.
    - Uses **3-way handshake** (SYN, SYN-ACK, ACK) to establish a connection.
    - Ensures ordered delivery and error checking.
  - **UDP (User Datagram Protocol)**
    - Connectionless, faster but less reliable.
    - Used for **streaming, VoIP, gaming**.

### 3. **Internet Layer** (Network Layer in OSI)
- Handles **packet routing** across networks using IP addressing.
- Key Protocols:
  - **IP (Internet Protocol)** – Assigns unique IP addresses to devices.
  - **ICMP (Internet Control Message Protocol)** – Used for network diagnostics (ping, traceroute).
  - **ARP (Address Resolution Protocol)** – Resolves IP addresses to MAC addresses.

### 4. **Network Access Layer** (Link Layer / Physical Layer in OSI)
- Deals with hardware addressing and physical transmission of data.
- Responsible for converting packets into **electrical, optical, or radio signals**.
- Includes:
  - **Ethernet, Wi-Fi** (Physical transmission)
  - **MAC Addresses (Media Access Control)** – Unique identifier for network interfaces.

## **Comparison: TCP/IP vs. OSI Model**
| TCP/IP Model | OSI Model |
|-------------|----------|
| Application | Application, Presentation, Session |
| Transport   | Transport |
| Internet    | Network |
| Network Access | Data Link, Physical |

## **Why is the TCP/IP Model Important?**
- **Foundation of the modern internet** – Every web request follows this model.
- **More practical than OSI** – Directly maps to real-world networking.
- **Enables scalability** – Used for everything from local networks to global-scale systems.

## **Real-World Example: Accessing a Website**
1. **You type `google.com` in your browser.**
   - Application Layer: Browser uses **DNS** to resolve `google.com` to an IP address.
2. **Browser establishes a connection to Google’s server.**
   - Transport Layer: TCP **3-way handshake** is performed.
3. **Data is routed across the internet.**
   - Internet Layer: Packets move between networks using IP routing.
4. **Google's web server responds and sends the page.**
   - Transport Layer: TCP ensures reliable delivery.
   - Application Layer: The browser renders the HTML, CSS, and JS.

---
This model is the backbone of modern networking and web applications, making it essential for software engineers to understand. 🚀