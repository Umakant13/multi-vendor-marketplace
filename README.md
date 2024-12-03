# Multi-Vendor Marketplace

An e-commerce platform where multiple vendors can list their products, manage orders, and track their sales. The system supports customers, sellers, and admins with various features such as product management, payment gateways, order history, and more.

## Technology Stack

### Frontend:
- React
- TypeScript
- Redux Toolkit
- MUI (Material UI)
- Tailwind CSS
- React Chart
- Formik, Yup
- React Router DOM
- Axios

### Backend:
- Spring Boot
- MySQL
- Spring Security
- JWT Authentication
- Java Mail Sender

### Payment Gateways:
- Razorpay (for Indian users)
- Stripe (for international users)

---

## Features

### Customer Features
- **Chatbot**: Get answers to queries regarding orders, cart, and products.
- **Product Management**: Browse, filter, and view product details.
- **Cart Management**: Add items to cart, update quantities, and checkout.
- **Order History**: View past orders and manage cancellations.
- **Account Management**: Update personal details and track orders.
- **Review & Rating**: Write product reviews.
- **Wishlist**: Add/remove products from your wishlist.

### Seller Features
- **Seller Dashboard**: View earnings, sales, and manage products.
- **Order Management**: Track and manage customer orders.
- **Payments & Transactions**: View transaction history and manage payments.

### Admin Features
- **Admin Dashboard**: Manage sellers, handle approvals, and suspensions.
- **Coupon Management**: Create and manage discount coupons.
- **Home Page Management**: Update homepage content and deals.

---

## Setup

### Prerequisites:
- Java 8 or later
- Node.js and npm
- MySQL database
- API keys for Stripe and Razorpay

### Frontend Setup (React)

1. **Open the frontend project in VS Code**.

2. **Install Dependencies**:
   ```bash
   npm install
   
3. Run the Frontend:
   ```bash
   npm run dev

4. Signup: Visit the application and sign up to begin using the platform.

### Backend Setup (Spring Boot)

1. **Open the project in IntelliJ IDEA**.

2. **Configure Database**:
   - Open the `application.properties` file.
     
   - Update the following:
     - **Username**: Set your MySQL username.
     - **Password**: Set your MySQL password.
     - **Create Database**: Create a new database in MySQL with the same name configured in `application.properties`.
       
3. **Payment Gateway Configuration**:
   - Update Razorpay API & Secret keys in the `application.properties` file.
     
4. **Email Configuration**:
   - Provide your Gmail and App Password for email functionalities
     
5. **Gemini API Key**:
   - Set your Gemini API key for handling payments in the project.
     
6. **Run the Backend**:
   - Build the project using Maven: 
     ```bash
     mvn clean install
     ```
   - Start the Spring Boot application:
     ```bash
     mvn spring-boot:run
     ```
     
## Contributing
Feel free to fork and create pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License. See the LICENSE file for details.
