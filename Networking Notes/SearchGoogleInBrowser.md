# What Happens When You Enter `google.com` in a Browser?

## 1. DNS Resolution (Domain Name System)
- The browser checks its **cache** for the IP address of `google.com`.
- If not found, it queries the **DNS resolver** to translate `google.com` into an **IP address**.
- The resolution process includes:
  1. Checking the browser, OS, and router cache.
  2. Asking the ISP's **recursive DNS resolver**.
  3. Querying **root DNS servers**.
  4. Getting the IP from the **authoritative DNS server** for `google.com`.

## 2. TCP Handshake (Connection Establishment)
- The browser establishes a connection to the IP address via **TCP (Transmission Control Protocol)** using **port 443** (for HTTPS).
- This involves a **three-way handshake**:
  1. **SYN** → The client sends a request to the server to initiate a connection.
  2. **SYN-ACK** → The server acknowledges the request.
  3. **ACK** → The client acknowledges and establishes the connection.
- If QUIC (which runs over **UDP**) is used, it skips the traditional TCP handshake.

## 3. TLS Handshake (Secure Connection)
- Since Google uses **HTTPS**, the browser and server perform a **TLS (SSL) handshake**:
  1. Agreeing on encryption algorithms.
  2. The server sends its **SSL certificate** to verify authenticity.
  3. A **shared encryption key** is generated.
  4. Secure encrypted communication begins.

## 4. HTTP Request
- The browser sends an **HTTP GET request** to `https://www.google.com`:

  ```http
  GET / HTTP/1.1  
  Host: www.google.com  
  User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64)  
  Accept: text/html  
  ```
- The request reaches **Google's load balancer**, which directs it to a **Google data center**.

## 5. Server Processing & Response
- The request is handled by a **web server** (e.g., Nginx, Google Web Server).
- The backend processes the request and retrieves the Google homepage.
- The server sends back an **HTTP response**:

  ```http
  HTTP/2 200 OK  
  Content-Type: text/html  
  Content-Length: 34567  
  ```

## 6. Rendering the Web Page
- The browser receives **HTML, CSS, and JavaScript files**.
- It **parses and renders the HTML**.
- Styles and layouts are applied from **CSS**.
- JavaScript executes to enhance interactivity.

## 7. Google.com is Displayed 🎉
- The fully loaded Google homepage appears, ready for you to search.

## Additional Concepts Involved
✔ **CDN (Content Delivery Network)** → Loads assets faster from global locations.  
✔ **Browser Cache** → Saves static resources to reduce loading times.  
✔ **Asynchronous Loading** → JavaScript loads dynamically in the background.  

### This entire process happens in milliseconds! 🚀

