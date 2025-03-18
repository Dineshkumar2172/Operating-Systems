# Disk Scheduling Algorithms

## Introduction to Disk Scheduling

Disk scheduling is the method used by the operating system to decide the order in which disk I/O (Input/Output) requests are processed. Since disk access time is relatively slow compared to CPU and memory operations, efficient scheduling is crucial for system performance.

### Why is Disk Scheduling Needed?
- **Minimizing Seek Time:** The time taken to move the disk's read/write head to the correct track.
- **Reducing Latency:** The delay before the required sector rotates under the read/write head.
- **Optimizing Throughput:** The number of I/O operations completed per unit time.
- **Ensuring Fairness:** Avoiding starvation of certain requests.

## Disk Scheduling Algorithms

### 1. First Come, First Served (FCFS)
- **Description:** Requests are processed in the order they arrive.
- **Advantages:**
  - Simple and easy to implement.
  - Ensures fairness since requests are handled sequentially.
- **Disadvantages:**
  - Can cause long wait times if a request at one end of the disk is followed by one at the opposite end (poor performance).
- **Example:**
  - Request queue: `[98, 183, 37, 122, 14, 124, 65, 67]`
  - Head starts at 53 → Process requests in the same order.

### 2. Shortest Seek Time First (SSTF)
- **Description:** Selects the request closest to the current head position.
- **Advantages:**
  - Reduces average seek time compared to FCFS.
- **Disadvantages:**
  - May lead to **starvation** of far requests if new closer requests keep arriving.
- **Example:**
  - Request queue: `[98, 183, 37, 122, 14, 124, 65, 67]`
  - Head at 53 → Selects the nearest request first (e.g., 65 instead of 98).

### 3. SCAN (Elevator Algorithm)
- **Description:** The disk arm moves in one direction servicing requests, then reverses direction at the end.
- **Advantages:**
  - Prevents starvation.
  - Balances efficiency and fairness.
- **Disadvantages:**
  - High seek time if a request is at the opposite end just before a turnaround.
- **Example:**
  - If the head starts at 53 moving toward 200, it services requests in increasing order.

### 4. C-SCAN (Circular SCAN)
- **Description:** Similar to SCAN, but instead of reversing direction, the disk arm moves to the end and jumps back to the beginning.
- **Advantages:**
  - Provides more uniform wait times.
  - Ensures fair servicing of all requests.
- **Disadvantages:**
  - Longer seek times compared to SSTF.
- **Example:**
  - If the head reaches the highest request, it jumps back to the lowest request without servicing in the reverse direction.

## Conclusion
Disk scheduling algorithms play a crucial role in optimizing disk performance by minimizing seek time and improving throughput. The choice of algorithm depends on system requirements, workload patterns, and fairness considerations.

