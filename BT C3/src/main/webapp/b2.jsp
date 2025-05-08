<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bảng Sinh Viên</title>

    <!-- Nhúng Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .stis {
            color: white;               /* Màu chữ */
            background-color: pink;  /* Màu nền xanh dương */
            border: 2px solid #000000;  /* Màu viền đen */
        }
    </style>
</head>

<body>
	<div class="container mt-4">
	
        <table class="table stis text-center">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Mã SV</th>
                    <th>Họ và tên</th>
                    <th>Quê quán</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>SV001</td>
                    <td>Phạm Thị Hồng Yến</td>
                    <td>Hải Phòng</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>SV002</td>
                    <td>Vũ Thị Quỳnh<td>
                    <td>Ninh Bình</td>
                </tr>
            </tbody>
        </table>
        
    </div>

</body>
</html>