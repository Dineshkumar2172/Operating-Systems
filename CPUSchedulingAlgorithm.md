# CPU Scheduling Algorithms Explained

## **1. What is CPU Scheduling?**
When multiple processes or threads need the CPU, **CPU scheduling** decides **which one gets executed first**. The goal is to optimize **CPU utilization, response time, and throughput**.

### **How It Works:**
- The process that arrives **first** gets executed first (**like a queue**).
- The **CPU scheduler** decides **which process to execute next**.

## **2. Types of CPU Scheduling**
CPU scheduling can be classified into two categories:

| Scheduling Type | Description |
|---------------|-------------|
| **Preemptive Scheduling** | The CPU **can switch** from one process to another before it completes execution. |
| **Non-Preemptive Scheduling** | The CPU **waits until** the process finishes before switching. |

## **3. CPU Scheduling Algorithms**
### **(A) First Come, First Served (FCFS)**
✅ **Non-Preemptive**  
✅ **Simplest** scheduling algorithm  
🚨 **Issue:** **Long processes block shorter ones** (not efficient).  

#### **How It Works:**
- The process that arrives **first** gets executed first.

#### **Example:**
```
Process   Arrival Time   Burst Time  
P1        0             5  
P2        1             3  
P3        2             8  
```
🔹 Execution Order: **P1 → P2 → P3**

---

### **(B) Shortest Job Next (SJN)**
✅ **Non-Preemptive**  
✅ **Better than FCFS** because it reduces waiting time.  
🚨 **Issue:** Long processes **may never get CPU** (**Starvation**).

#### **How It Works:**
- **Shortest burst time** process gets CPU first.

#### **Example:**
```
Process   Arrival Time   Burst Time  
P1        0             8  
P2        1             4  
P3        2             2  
```
🔹 Execution Order: **P3 → P2 → P1**

---

### **(C) Shortest Remaining Time First (SRTF)**
✅ **Preemptive version of SJN**  
✅ **Efficient, minimizes waiting time**  
🚨 **Issue:** **Starvation** for longer processes.

#### **How It Works:**
- If a **new process arrives with a shorter burst time**, the CPU **switches to it**.

#### **Example:**
```
Process   Arrival Time   Burst Time  
P1        0             8  
P2        1             4  
P3        2             2  
```
🔹 Execution Order: **P1 → P3 → P2 → P1**

---

### **(D) Round Robin (RR)**
✅ **Preemptive**  
✅ **Good for time-sharing systems**  
🚨 **Issue:** **Too small time slices cause too many context switches**.

#### **How It Works:**
- **Each process gets a fixed time slice (quantum).**
- If a process **doesn't finish**, it goes to the **end of the queue**.

#### **Example (Time Quantum = 3ms)**
```
Process   Arrival Time   Burst Time  
P1        0             8  
P2        1             4  
P3        2             2  
```
🔹 Execution Order: **P1(3ms) → P2(3ms) → P3(2ms) → P1 → P2 → P1**

---

### **(E) Priority Scheduling**
✅ **Preemptive or Non-Preemptive**  
✅ **Processes with **higher priority get executed first**  
🚨 **Issue:** Low-priority processes may **starve** (**Solution: Aging**).

#### **How It Works:**
- Each process gets a **priority number** (lower number = higher priority).

#### **Example:**
```
Process   Arrival Time   Burst Time   Priority  
P1        0             5            3  
P2        1             3            1  
P3        2             8            2  
```
🔹 Execution Order: **P2 → P3 → P1**

---

## **4. Comparison Table of Scheduling Algorithms**
| Algorithm | **Preemptive?** | **Fair?** | **Starvation?** | **Best for** |
|-----------|---------------|---------|-------------|-------------|
| **FCFS**  | ❌ No | ❌ No | ❌ Yes (long jobs delay others) | Simple batch systems |
| **SJN**   | ❌ No | ❌ No | ✅ Yes | Minimize waiting time (but risk of starvation) |
| **SRTF**  | ✅ Yes | ❌ No | ✅ Yes | Minimize response time |
| **RR**    | ✅ Yes | ✅ Yes | ❌ No | **Time-sharing systems** |
| **Priority** | ✅ Yes / ❌ No | ❌ No | ✅ Yes | **Critical applications** |

---

## **5. Choosing the Right CPU Scheduling Algorithm**
✅ **Use FCFS** if you want **simple scheduling** but can tolerate long waits.  
✅ **Use SJN** if you **want low waiting time** but are okay with starvation risk.  
✅ **Use Round Robin** for **fairness in time-sharing systems**.  
✅ **Use Priority Scheduling** when some processes **must be completed first**.  

🚀 **Most operating systems use a mix of these algorithms!**  
For example:  
- **Linux uses Completely Fair Scheduler (CFS)** (a mix of Priority + Round Robin).  
- **Windows uses a hybrid approach** (Priority + Multilevel Queue Scheduling).  

---

## **🔥 Key Takeaways**
🔹 **CPU scheduling is essential** for efficiency in multitasking systems.  
🔹 **FCFS is simple** but can cause **long wait times**.  
🔹 **Round Robin ensures fairness**, but context switching overhead exists.  
🔹 **Priority scheduling can lead to starvation**, which **aging solves**.  
🔹 **Modern OSs use a hybrid approach** (Linux CFS, Windows Priority Scheduling).  

💡 **Understanding scheduling helps in OS design, performance tuning, and interview prep!** 🚀

