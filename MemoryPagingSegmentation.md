# Virtual Memory, Paging, and Segmentation

references:
    - https://youtu.be/2quKyPnUShQ - virtual memory - https://youtu.be/p9yZNLeOj4s - segmented, pages and virtual memory

## 1. Virtual Memory

### What is Virtual Memory?
- Virtual memory is a **memory management technique** that allows programs to use more memory than what is physically available in RAM.
- It provides an **illusion** of a large, contiguous memory space, even though a program may be partially loaded in RAM while the rest is on disk.
- The OS manages virtual memory using **paging and swapping**.

### How does it work?
1. A program requests data stored in **virtual memory (address space)**.
2. The CPU generates a **virtual address** and checks the **page table** to see if the required data is in RAM.
3. If the data is in RAM, it is accessed immediately (fast access).
4. If it’s not in RAM (**page fault** occurs), the OS **swaps** the required data from disk into RAM and updates the page table.

### Advantages of Virtual Memory:
- ✅ **Allows running larger applications** than physical RAM capacity.
- ✅ **Enables multitasking** by allocating memory to multiple processes.
- ✅ **Improves security & isolation** by preventing programs from accessing each other’s memory.

### Disadvantages of Virtual Memory:
- ❌ **Slower than RAM** because accessing data from disk takes more time.
- ❌ **Page faults** can slow down the system significantly.

---

## 2. Paging

### What is Paging?
- Paging is a **memory management technique** that divides both **virtual memory** and **physical memory (RAM)** into fixed-sized blocks.
- These blocks are called:
  - **Pages (Virtual Memory)**
  - **Page Frames (Physical Memory - RAM)**
- The **size of a page is the same as the size of a page frame** (e.g., 4 KB, 8 KB).

### How does Paging work?
1. The program's memory is divided into **pages** (fixed-size chunks).
2. The RAM is divided into **page frames** of the same size.
3. A **Page Table** is used to map **virtual page numbers** to **physical frame numbers**.
4. When the CPU accesses a virtual address, it checks the page table to find the **physical frame** where the data is stored.

### Page Fault Handling:
- If the required page is not in RAM, a **page fault** occurs.
- The OS swaps the required page from the **disk (swap space)** into RAM.
- The **Least Recently Used (LRU)** page may be removed from RAM to make space for the new page.

### Example of Paging:
Assume a program needs **12 KB** of memory, and the **page size is 4 KB**.
- The program will be divided into **3 pages (each 4 KB)**.
- If RAM has space in 3 page frames, all pages can be loaded.
- Otherwise, the OS will swap pages as needed (page faults).

### Advantages of Paging:
- ✅ **No external fragmentation** (memory is used efficiently).
- ✅ **Allows non-contiguous memory allocation**, making it more flexible.

### Disadvantages of Paging:
- ❌ **Page table overhead** (the OS must maintain large page tables).
- ❌ **Page faults cause delays** (swapping data from disk is slow).

---

## 3. Segmentation

### What is Segmentation?
- Unlike paging, which divides memory into **fixed**-sized pages, segmentation divides memory into **logical** blocks of **variable** sizes.
- Each segment represents a different part of a program (e.g., **code segment, data segment, stack segment**).

### How does Segmentation work?
1. A process is divided into **segments** (e.g., function A, function B, arrays, variables).
2. Each segment has a **base address** (starting address) and a **limit** (size).
3. The CPU uses a **Segment Table** to map segment numbers to physical addresses.

### Example of Segmentation:
Assume a program has:
- **Code segment (10 KB)**
- **Stack segment (5 KB)**
- **Heap segment (15 KB)**

These segments are **not the same size** like in paging. The OS loads them separately into RAM, and their positions may not be contiguous.

### Advantages of Segmentation:
- ✅ **Better logical structure** (code, stack, and data are managed separately).
- ✅ **Easier for compilers & memory protection** since segments can have different permissions.

### Disadvantages of Segmentation:
- ❌ **External fragmentation** (since segments are variable-sized, gaps in memory can form).
- ❌ **Complex memory management** compared to paging.

---

## Paging vs. Segmentation

| Feature          | Paging | Segmentation |
|-----------------|--------|-------------|
| **Memory Division** | Fixed-size pages | Variable-size segments |
| **Fragmentation** | No external fragmentation | External fragmentation possible |
| **Logical Division** | No logical meaning (fixed pages) | Divides memory based on logical program structure |
| **Address Mapping** | Uses **Page Table** | Uses **Segment Table** |
| **Performance** | Faster access due to fixed size | Can be slower due to variable sizes |

---

## Conclusion
- **Virtual Memory** helps a system run more processes than physical RAM allows by using disk storage.
- **Paging** breaks memory into fixed-size pages and uses a page table for mapping.
- **Segmentation** divides memory into variable-sized, logically meaningful segments.
- Modern OS **combine paging and segmentation** for efficient memory management.