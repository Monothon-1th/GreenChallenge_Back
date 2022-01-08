use polar_bear;

insert into user(login_id, password, name, image)
values
('user1', '1234', '모노', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%86%E1%85%A9%E1%84%82%E1%85%A9%E1%84%91%E1%85%B3%E1%84%89%E1%85%A1.png'),
('user2', '1234', '김경순', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%80%E1%85%A7%E1%86%BC%E1%84%89%E1%85%AE%E1%86%AB%E1%84%91%E1%85%B3%E1%84%89%E1%85%A1.png');

insert into challenge(title, description, image, tag, participants)
values
('불필요한\n전기 플러그 뽑기', '', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%91%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A5%E1%84%80%E1%85%B3.png', '# 전기 절약', 3432),
('텀블러, 보틀 이용하기', '', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%90%E1%85%A5%E1%86%B7%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A5.png', '# 절약 실천', 1323),
('일회용품 줄이기', '일회용품 사용을 줄임으로써\n쓰레기를 10배 이상 줄일 수 있어요!', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%8B%E1%85%B5%E1%86%AF%E1%84%92%E1%85%AC%E1%84%8B%E1%85%AD%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7.jpeg', '# 쓰레기 감소', 3212),
('걷거나 대중교통\n이용하기', '', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%83%E1%85%A2%E1%84%8C%E1%85%AE%E1%86%BC%E1%84%80%E1%85%AD%E1%84%90%E1%85%A9%E1%86%BC.jpeg', '# 온실가스 감소', 3543),
('지역에서 생산된\n제품 사기', '', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%8C%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%A8%E1%84%89%E1%85%A2%E1%86%BC%E1%84%89%E1%85%A1%E1%86%AB%E1%84%91%E1%85%AE%E1%86%B7.jpeg', '# 온실가스 감소', 3868);

insert into list(category, writer_id, title, text, image, created_at, heart, comment)
values
('텀블러, 보틀 이용하기', 1, '텀블러, 보틀 이용하기 인증이요!', '텀블러를 사용해요!', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%86%E1%85%A9%E1%84%82%E1%85%A9%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%8C%E1%85%B3%E1%86%BC.png', '2022-01-09', 20, 18),
('불필요한\n전기 플러그 뽑기', 2, '플러그 뽑기 인증이요~^^', '생활 속에서 낭비되는 전기를 줄여요!', 'https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%80%E1%85%A7%E1%86%BC%E1%84%89%E1%85%AE%E1%86%AB%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%8C%E1%85%B3%E1%86%BC.png', '2022-01-09', 21, 29);