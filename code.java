<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>StockFlow | Inventory & Sales Management</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/feather-icons/dist/feather.min.js"></script>
    <script src="https://unpkg.com/feather-icons"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <style>
        .sidebar {
            transition: all 0.3s ease;
        }
        .dashboard-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 20px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body class="bg-gray-50">
    <!-- Sidebar -->
    <div class="flex h-screen">
        <div class="sidebar bg-indigo-700 text-white w-64 space-y-6 py-7 px-2 fixed inset-y-0 left-0 transform -translate-x-full md:translate-x-0 transition duration-200 ease-in-out">
            <div class="flex items-center space-x-2 px-4">
                <i data-feather="package" class="w-8 h-8"></i>
                <span class="text-2xl font-extrabold">StockFlow</span>
            </div>
            <nav>
                <a href="#" class="flex items-center space-x-2 py-2 px-4 bg-indigo-800 rounded-lg">
                    <i data-feather="home"></i>
                    <span>Dashboard</span>
                </a>
                <a href="inventory.html" class="flex items-center space-x-2 py-2 px-4 hover:bg-indigo-600 rounded-lg transition">
                    <i data-feather="box"></i>
                    <span>Inventory</span>
                </a>
                <a href="sales.html" class="flex items-center space-x-2 py-2 px-4 hover:bg-indigo-600 rounded-lg transition">
                    <i data-feather="shopping-cart"></i>
                    <span>Sales</span>
                </a>
                <a href="reports.html" class="flex items-center space-x-2 py-2 px-4 hover:bg-indigo-600 rounded-lg transition">
                    <i data-feather="bar-chart-2"></i>
                    <span>Reports</span>
                </a>
                <a href="suppliers.html" class="flex items-center space-x-2 py-2 px-4 hover:bg-indigo-600 rounded-lg transition">
                    <i data-feather="truck"></i>
                    <span>Suppliers</span>
                </a>
                <a href="settings.html" class="flex items-center space-x-2 py-2 px-4 hover:bg-indigo-600 rounded-lg transition">
                    <i data-feather="settings"></i>
                    <span>Settings</span>
                </a>
            </nav>
        </div>

        <!-- Mobile sidebar toggle -->
        <button class="md:hidden fixed top-4 left-4 z-50 bg-indigo-700 text-white p-2 rounded-lg" onclick="toggleSidebar()">
            <i data-feather="menu"></i>
        </button>

        <!-- Main Content -->
        <div class="flex-1 md:ml-64">
            <!-- Top Navigation -->
            <header class="bg-white shadow-sm">
                <div class="max-w-7xl mx-auto px-4 py-4 sm:px-6 lg:px-8 flex justify-between items-center">
                    <h1 class="text-2xl font-bold text-gray-800">Dashboard</h1>
                    <div class="flex items-center space-x-4">
                        <div class="relative">
                            <i data-feather="bell" class="text-gray-500 hover:text-indigo-600 cursor-pointer"></i>
                            <span class="absolute top-0 right-0 h-2 w-2 rounded-full bg-red-500"></span>
                        </div>
                        <div class="flex items-center space-x-2">
                            <img src="http://static.photos/people/200x200/1" alt="User" class="w-8 h-8 rounded-full">
                            <span class="text-gray-700">Admin</span>
                        </div>
                    </div>
                </div>
            </header>

            <!-- Dashboard Content -->
            <main class="max-w-7xl mx-auto px-4 py-6 sm:px-6 lg:px-8">
                <!-- Stats Cards -->
                <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6 mb-8">
                    <div class="dashboard-card bg-white rounded-lg shadow p-6" data-aos="fade-up">
                        <div class="flex items-center justify-between">
                            <div>
                                <p class="text-gray-500">Total Products</p>
                                <h3 class="text-3xl font-bold text-indigo-600">1,248</h3>
                            </div>
                            <div class="p-3 rounded-full bg-indigo-100 text-indigo-600">
                                <i data-feather="box"></i>
                            </div>
                        </div>
                        <p class="text-green-500 text-sm mt-2">+12% from last month</p>
                    </div>
                    <div class="dashboard-card bg-white rounded-lg shadow p-6" data-aos="fade-up" data-aos-delay="100">
                        <div class="flex items-center justify-between">
                            <div>
                                <p class="text-gray-500">Today's Sales</p>
                                <h3 class="text-3xl font-bold text-indigo-600">$3,420</h3>
                            </div>
                            <div class="p-3 rounded-full bg-green-100 text-green-600">
                                <i data-feather="dollar-sign"></i>
                            </div>
                        </div>
                        <p class="text-green-500 text-sm mt-2">+8% from yesterday</p>
                    </div>
                    <div class="dashboard-card bg-white rounded-lg shadow p-6" data-aos="fade-up" data-aos-delay="200">
                        <div class="flex items-center justify-between">
                            <div>
                                <p class="text-gray-500">Low Stock Items</p>
                                <h3 class="text-3xl font-bold text-indigo-600">24</h3>
                            </div>
                            <div class="p-3 rounded-full bg-yellow-100 text-yellow-600">
                                <i data-feather="alert-triangle"></i>
                            </div>
                        </div>
                        <p class="text-red-500 text-sm mt-2">Needs attention</p>
                    </div>
                    <div class="dashboard-card bg-white rounded-lg shadow p-6" data-aos="fade-up" data-aos-delay="300">
                        <div class="flex items-center justify-between">
                            <div>
                                <p class="text-gray-500">Monthly Revenue</p>
                                <h3 class="text-3xl font-bold text-indigo-600">$42,580</h3>
                            </div>
                            <div class="p-3 rounded-full bg-purple-100 text-purple-600">
                                <i data-feather="trending-up"></i>
                            </div>
                        </div>
                        <p class="text-green-500 text-sm mt-2">+15% from last month</p>
                    </div>
                </div>

                <!-- Charts -->
                <div class="grid grid-cols-1 lg:grid-cols-2 gap-6 mb-8">
                    <div class="bg-white rounded-lg shadow p-6" data-aos="fade-right">
                        <h2 class="text-lg font-semibold text-gray-800 mb-4">Sales Overview</h2>
                        <canvas id="salesChart" height="250"></canvas>
                    </div>
                    <div class="bg-white rounded-lg shadow p-6" data-aos="fade-left">
                        <h2 class="text-lg font-semibold text-gray-800 mb-4">Inventory Categories</h2>
                        <canvas id="inventoryChart" height="250"></canvas>
                    </div>
                </div>

                <!-- Recent Activity -->
                <div class="bg-white rounded-lg shadow overflow-hidden" data-aos="fade-up">
                    <div class="px-6 py-4 border-b border-gray-200">
                        <h2 class="text-lg font-semibold text-gray-800">Recent Sales</h2>
                    </div>
                    <div class="divide-y divide-gray-200">
                        <div class="px-6 py-4 flex items-center justify-between hover:bg-gray-50">
                            <div class="flex items-center space-x-4">
                                <div class="bg-green-100 text-green-600 p-2 rounded-full">
                                    <i data-feather="shopping-bag"></i>
                                </div>
                                <div>
                                    <p class="font-medium">Order #SF-10025</p>
                                    <p class="text-gray-500 text-sm">2 hours ago</p>
                                </div>
                            </div>
                            <span class="font-semibold">$245.00</span>
                        </div>
                        <div class="px-6 py-4 flex items-center justify-between hover:bg-gray-50">
                            <div class="flex items-center space-x-4">
                                <div class="bg-blue-100 text-blue-600 p-2 rounded-full">
                                    <i data-feather="shopping-bag"></i>
                                </div>
                                <div>
                                    <p class="font-medium">Order #SF-10024</p>
                                    <p class="text-gray-500 text-sm">4 hours ago</p>
                                </div>
                            </div>
                            <span class="font-semibold">$189.50</span>
                        </div>
                        <div class="px-6 py-4 flex items-center justify-between hover:bg-gray-50">
                            <div class="flex items-center space-x-4">
                                <div class="bg-purple-100 text-purple-600 p-2 rounded-full">
                                    <i data-feather="shopping-bag"></i>
                                </div>
                                <div>
                                    <p class="font-medium">Order #SF-10023</p>
                                    <p class="text-gray-500 text-sm">6 hours ago</p>
                                </div>
                            </div>
                            <span class="font-semibold">$320.75</span>
                        </div>
                    </div>
                    <div class="px-6 py-3 bg-gray-50 text-right">
                        <a href="sales.html" class="text-indigo-600 hover:text-indigo-800 font-medium">View all sales</a>
                    </div>
                </div>
            </main>
        </div>
    </div>

    <script>
        // Toggle sidebar on mobile
        function toggleSidebar() {
            const sidebar = document.querySelector('.sidebar');
            sidebar.classList.toggle('-translate-x-full');
        }

        // Initialize AOS animations
        AOS.init({
            duration: 800,
            easing: 'ease-in-out',
            once: true
        });

        // Initialize charts
        document.addEventListener('DOMContentLoaded', function() {
            feather.replace();
            
            // Sales Chart
            const salesCtx = document.getElementById('salesChart').getContext('2d');
            const salesChart = new Chart(salesCtx, {
                type: 'line',
                data: {
                    labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul'],
                    datasets: [{
                        label: 'Sales',
                        data: [12000, 19000, 15000, 18000, 21000, 25000, 28000],
                        backgroundColor: 'rgba(79, 70, 229, 0.1)',
                        borderColor: 'rgba(79, 70, 229, 1)',
                        borderWidth: 2,
                        tension: 0.4,
                        fill: true
                    }]
                },
                options: {
                    responsive: true,
                    plugins: {
                        legend: {
                            display: false
                        }
                    },
                    scales: {
                        y: {
                            beginAtZero: true,
                            grid: {
                                drawBorder: false
                            }
                        },
                        x: {
                            grid: {
                                display: false
                            }
                        }
                    }
                }
            });

            // Inventory Chart
            const inventoryCtx = document.getElementById('inventoryChart').getContext('2d');
            const inventoryChart = new Chart(inventoryCtx, {
                type: 'doughnut',
                data: {
                    labels: ['Electronics', 'Clothing', 'Furniture', 'Groceries', 'Other'],
                    datasets: [{
                        data: [35, 25, 15, 15, 10],
                        backgroundColor: [
                            'rgba(79, 70, 229, 0.8)',
                            'rgba(99, 102, 241, 0.8)',
                            'rgba(129, 140, 248, 0.8)',
                            'rgba(165, 180, 252, 0.8)',
                            'rgba(199, 210, 254, 0.8)'
                        ],
                        borderWidth: 0
                    }]
                },
                options: {
                    responsive: true,
                    plugins: {
                        legend: {
                            position: 'right'
                        }
                    },
                    cutout: '70%'
                }
            });
        });
    </script>
</body>
</html>
